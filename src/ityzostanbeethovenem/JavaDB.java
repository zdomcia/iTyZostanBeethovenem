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
            String dodajSQL1 = "INSERT INTO " + baza + " (Question, AnswerA, AnswerB, AnswerC, AnswerD, CorrectAnswer, idCategory, Scores)"

                    //kategoria instrumenty
                    + "VALUES ('Ile klawiszy ma typowy współczesny fortepian?','134','88','17','79','B', 1, 10),"
                    + "('Który instrument smyczkowy jest najmniejszy?','skrzypce','altówka','wiolonczela','kontrabas', 'A', 1, 10);"                    
                    + "('Helikon to instrument: ','dęty klawiszowy','dęty drewniany','dęty blaszany','perkusyjny', 'C', 1, 15);"                    
                    + "('W którym roku zbudowano pierwszy fortepian?','około 1709','około 1589','około 1895','około 1636', 'A', 1, 10);"
                    + "('Z jakiego miasta pochodzi rożek angielski?','z Londynu','z Paryża','z Wrocławia','ze Sztokholmu', 'C', 1, 10);"
                    + "('Ile instrumentów zbudowanych przez Antonio Stradivariego wciąż istnieje?','około 650','5','około 100','23', 'A', 1, 15);"
                    + "('Jaki instrument jest symbolem Irlandii?','trąbka','dudy','gitara','harfa', 'D', 1, 15);"
                    + "('Który instrument ma najbardziej skomplikowaną budowę?','fortepian','klarnet','organy','kontrabas', 'C', 1, 10);"
                    + "('Ile strun mają skrzypce?','1','2','3','4', 'D', 1, 10);"
                    + "('Który instrument nie ma membrany?','bęben','kotły','werbel','trójkąt', 'D', 1, 10);"
                    + "('Instrumentem strunowym szarpanym NIE jest','bandżola','czelestra','klawesyn','shamisen', 'B', 1, 15);"
                    + "('Saksofon jest instrumentem:','dętym blaszanym','dętym drewnianym','strunowym','perkusyjnym', 'B', 1, 10);"
                    + "('Która osoba tworzyła gitary?','Leonardo Da Vinci','Andrea Amati','Antonio Stradivari','Jan Schmidt', 'C', 1, 15);"
                    + "('Który z poniższych instrumentów jest smyczkowy?','fortepian','flet','perkusja','skrzypce', 'D', 1, 10);"
                    + "('Który z instrumentów nie należy do grupy instrumentów dętych drewnianych?','saksofon','rożek angielski','kontrafagot','sakshorn', 'D', 1, 10);"
                    + "('Kto zbudował pierwsze skrzypce?', 'Jan Schmidt', 'Robert Wornum','Andrea Amati','Antonio Stradivari', 'C', 1, 10);"

                    //kategoria kompozytorzy
                    + "('Jakiej narodowości był Beethoven?','niemieckiej','angielskiej','francuskiej','rosyjskiej','A', 2, 10),"
                    + "('Kto jest autorem Walca Płatków Śniegu?','Vivaldi','Czajkowski','Mozart','Chopin', 'B', 2, 10);"                    
                    + "('W którym wieku żył Mozart?','XVII','XIV','XV','XVIII', 'D', 2, 10);"                    
                    + "('Jaka choroba spowodowała śmierć Chopina?','gruźlica','mukowiscydoza','nie był chory','nie wiadomo', 'D', 2, 15);"
                    + "('W którym roku zmarł Stanisław Moniuszko?','1679','1872','1916','1748', 'B', 2, 20);"                    
                    + "('Na co cierpiał Beethoven?','na głuchotę','na ślepotę','był niemy','żadna z powyższych', 'A', 2, 10);"
                    + "('Ile nokturnów stworzył Chopin?','0','5','18','42', 'C', 2, 15);"
                    + "('Do której grupy kompozytorów należy Karol Szymanowski?','baroku','Młodej Polski','klasycyzmu','romantyzmu', 'B', 2, 15);"
                    + "('Którego kompozytora zalicza się do tzw. klasyków wiedeńskich?','Antonio Salieriego','Josepha Haydna','Christopha Glucka','wszystkich 3', 'B', 2, 20);"
                    + "('Który z kompozytorów żył najwcześniej?','J.S. Bach','K. Szymanowski','W. A. Mozart','F. Chopin', 'A', 2, 15);"                    
                    + "('Której z oper NIE skomponował Mozart?','Wesele Figara','Uprowadzenie z Seraju','Cyrulik sewilski','Czarodziejski flet', 'C', 2, 20);"
                    + "('W jakim mieście zmarł Fryderyk Chopin?','Londyn','Żelazowa Wola','Paryż','Warszawa', 'C', 2, 10);"
                    + "('Syn którego kompozytora miał wpływ na twórczość Mozarta?','Chopina','Beethovena','Bacha','Moniuszki', 'C', 2, 20);"
                    + "('Jakich utworów nie tworzył Jan Sebastian Bach?','oper','kantat','pasji','żadnych z powyższych', 'A', 2, 15);"
                    + "('Beethoven stał się najpierw sławny jako:', 'śpiewak', 'wirtuoz fortepianu','skrzypek','aktor', 'B', 2, 10);";
                   
            
            
            stat.executeUpdate(dodajSQL1);
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
