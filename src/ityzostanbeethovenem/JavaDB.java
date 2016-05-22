package ityzostanbeethovenem;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDB {

    void uploadQuestions() {
        try {
            String baza = "Quiz";
            Connection polaczenie = polacz(baza);

            File link = new File("Quiz.db");
            if (!link.exists()) {
                link.delete();
            }
            stworzTablice(polaczenie, baza);
            dodajDane(baza);
            dodajPytania(baza);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static Connection polacz(String baza) {
        Connection polaczenie = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + baza + ".db");
            //System.out.println("Połączyłem się z bazą "+baza);
        } catch (Exception e) {
            e.toString();
            return null;
        }
        return polaczenie;
    }

    public static void dodajDane(String baza) {
        Connection polaczenie = null;
        Statement stat = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + baza + ".db");

            stat = polaczenie.createStatement();
            String dodajSQL = "INSERT INTO " + baza + " (Question, AnswerA, AnswerB, AnswerC, AnswerD, CorrectAnswer, idCategory, Scores)"
                    + "VALUES ('Pytanie1','odpowiedzA','odpowiedzB','odpowiedzC','odpowiedzD','A', 1, 10),"
                    + "('Pytanie2','odpowiedzA','odpowiedzB','odpowiedzC','odpowiedzD', 'B', 1, 15);";
            stat.executeUpdate(dodajSQL);
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println("Nie mogę dodać danych " + e.getMessage());
        }
    }

    public static void dodajPytania(String baza) {
        Connection polaczenie = null;
        Statement stat = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + baza + ".db");
            stat = polaczenie.createStatement();

            // Polecenie wyszukania
            String szukajSQL = "SELECT * FROM " + baza + ";";

            ResultSet wynik = stat.executeQuery(szukajSQL);

            while (wynik.next()) {
                System.out.println(wynik.getString("Question"));
            }
            wynik.close();
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void zmien(String baza, String poleSzukane, String wartoscSzukana,
            String poleZmieniane, String nowaWartosc) {
        Connection polaczenie = null;
        Statement stat = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + baza + ".db");
            stat = polaczenie.createStatement();
            // Polecenie zmiany
            String zmienSQL = "UPDATE " + baza + " SET "
                    + poleZmieniane + " = '" + nowaWartosc
                    + "' WHERE " + poleSzukane + "='" + wartoscSzukana + "';";

            ResultSet wynik = stat.executeQuery(zmienSQL);
            System.out.println("Polecenie:\n" + zmienSQL);
            wynik.close();
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println("Nie mogę poprawić danych " + e.getMessage());
        }

    }

    public static void stworzTablice(Connection polaczenie, String tablica) {
        // Obiekt odpowiadający za wykonanie instrukcji
        Statement stat = null;
        try {
            stat = polaczenie.createStatement();
            // polecenie SQL tworzące tablicę
            String tablicaSQL = "CREATE TABLE [Quiz] (\n"
                    + "    [id] INTEGER PRIMARY KEY NOT NULL,\n"
                    + "	[Question] VARCHAR(255) NULL,\n"
                    + "    [AnswerA] VARCHAR(255) NULL,\n"
                    + "    [AnswerB] VARCHAR(13) NULL,\n"
                    + "    [AnswerC] VARCHAR(255),\n"
                    + "    [AnswerD] VARCHAR(255) NULL,\n"
                    + "	[CorrectAnswer] VARCHAR(255) NULL,\n"
                    + "	[idCategory] INTEGER NULL,\n"
                    + "	[Scores] INTEGER NULL);";
            // wywołanie polecenia
            stat.executeUpdate(tablicaSQL);
            // zamykanie wywołania i połączenia
            stat.close();
            polaczenie.close();
        } catch (SQLException e) {
            System.out.println("Nie mogę stworzyć tablicy" + e.getMessage());
        }
    }
}
