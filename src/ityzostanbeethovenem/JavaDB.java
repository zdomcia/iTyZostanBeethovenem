package ityzostanbeethovenem;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDB {

    public static Pytanie[] pytania = new Pytanie[100];

    void uploadQuestions() {
        try {
            String baza = "Quiz";
            Connection polaczenie = polacz(baza);

            File link = new File("Quiz.db");
            if (!link.exists()) {
                stworzTablice(polaczenie, baza);
                dodajDane(baza);
            }
            dodajPytania();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
   
    
    

    public static Connection polacz(String baza) {
        Connection polaczenie = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + baza + ".db");
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

    public static void dodajPytania() {
        Connection polaczenie = null;
        Statement stat = null;
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + "Quiz" + ".db");
            stat = polaczenie.createStatement();

            String szukajSQL = "SELECT * FROM " + "Quiz" + ";";

            ResultSet wynik = stat.executeQuery(szukajSQL);
            int licznik = 0;
            while (wynik.next()) {
                Pytanie p = new Pytanie(wynik.getString("Question"), wynik.getString("AnswerA"), wynik.getString("AnswerB"),
                        wynik.getString("AnswerC"), wynik.getString("AnswerD"), wynik.getString("CorrectAnswer"), Integer.parseInt(wynik.getString("Scores")),
                        Integer.parseInt(wynik.getString("idCategory")));
                pytania[licznik] = p;
                licznik++;
            }
            wynik.close();
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void dodajPytaniaKategorii( int idKategorii) {
        Connection polaczenie = null;
        Statement stat = null;
        pytania = new Pytanie[100];
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + "Quiz" + ".db");
            stat = polaczenie.createStatement();

            String szukajSQL = "SELECT * FROM " + "Quiz" + " WHERE idCategory = " + idKategorii + ";";

            ResultSet wynik = stat.executeQuery(szukajSQL);
            int licznik = 0;
            while (wynik.next()) {
                Pytanie p = new Pytanie(wynik.getString("Question"), wynik.getString("AnswerA"), wynik.getString("AnswerB"),
                        wynik.getString("AnswerC"), wynik.getString("AnswerD"), wynik.getString("CorrectAnswer"), Integer.parseInt(wynik.getString("Scores")),
                        Integer.parseInt(wynik.getString("idCategory")));
                pytania[licznik] = p;
                licznik++;
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
