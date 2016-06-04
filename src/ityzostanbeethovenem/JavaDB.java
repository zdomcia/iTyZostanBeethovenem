package ityzostanbeethovenem;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDB {

    public static Question[] pytania = new Question[100];
    public static int size;

    
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
                Question p = new Question(wynik.getString("Question"), wynik.getString("AnswerA"), wynik.getString("AnswerB"),
                        wynik.getString("AnswerC"), wynik.getString("AnswerD"), wynik.getString("CorrectAnswer"), Integer.parseInt(wynik.getString("Scores")),
                        Integer.parseInt(wynik.getString("idCategory")));
                pytania[licznik] = p;
                licznik++;
            }
            size = licznik;
            wynik.close();
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dodajPytaniaKategorii(int idKategorii) {
        Connection polaczenie = null;
        Statement stat = null;
        pytania = new Question[100];
        try {
            Class.forName("org.sqlite.JDBC");
            polaczenie = DriverManager.getConnection("jdbc:sqlite:" + "Quiz" + ".db");
            stat = polaczenie.createStatement();

            String szukajSQL = "SELECT * FROM " + "Quiz" + " WHERE idCategory = " + idKategorii + ";";

            ResultSet wynik = stat.executeQuery(szukajSQL);
            int licznik = 0;
            while (wynik.next()) {
                Question p = new Question(wynik.getString("Question"), wynik.getString("AnswerA"), wynik.getString("AnswerB"),
                        wynik.getString("AnswerC"), wynik.getString("AnswerD"), wynik.getString("CorrectAnswer"), Integer.parseInt(wynik.getString("Scores")),
                        Integer.parseInt(wynik.getString("idCategory")));
                pytania[licznik] = p;
                licznik++;
            }
            size = licznik;
            wynik.close();
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void stworzTablice(Connection polaczenie, String tablica) {
        
        Statement stat = null;
        try {
            stat = polaczenie.createStatement();

            String tablicaSQL = "CREATE TABLE IF NOT EXISTS [Quiz] (\n"
                    + "    [id] INTEGER PRIMARY KEY NOT NULL,\n"
                    + "	[Question] VARCHAR(255) NULL,\n"
                    + "    [AnswerA] VARCHAR(255) NULL,\n"
                    + "    [AnswerB] VARCHAR(13) NULL,\n"
                    + "    [AnswerC] VARCHAR(255),\n"
                    + "    [AnswerD] VARCHAR(255) NULL,\n"
                    + "	[CorrectAnswer] VARCHAR(255) NULL,\n"
                    + "	[idCategory] INTEGER NULL,\n"
                    + "	[Scores] INTEGER NULL, "
                    + " UNIQUE (id, Question));";
            
            stat.executeUpdate(tablicaSQL);
            stat.close();
            polaczenie.close();

        } catch (SQLException e) {
            System.out.println("Nie mogę stworzyć tablicy" + e.getMessage());
        }
    }
    
    
    void uploadQuestions() {
        try {

            File link = new File("Quiz.db");
            if (link.exists()) {
                link.delete();
            }

            String baza = "Quiz";
            Connection polaczenie = polacz(baza);

            stworzTablice(polaczenie, baza);
            dodajDane(baza);
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
                    //kategoria instrumenty
                    + "VALUES ('Ile klawiszy ma typowy współczesny fortepian?','190','88','17','7','B', 1, 10),"
                    + "('Który instrument smyczkowy jest najmniejszy?','skrzypce','altówka','wiolonczela','kontrabas', 'A', 1, 10),"
                    + "('Helikon to instrument: ','dęty','smyczkowy','klawiszowy','perkusyjny', 'A', 1, 15),"
                    + "('W którym roku zbudowano pierwszy fortepian?','około 1709','około 1506','około 1005','około 636', 'A', 1, 10),"
                    + "('Z jakiego miasta pochodzi rożek angielski?','z Londynu','z Paryża','z Wrocławia','ze Sztokholmu', 'C', 1, 10),"
                    + "('Który instrument należy do grupy dętych drewnianych?','fagot','gitara','trąbka','trójkąt', 'A', 1, 15),"
                    + "('Jaki instrument jest szczególnie popularny w Szkocji?','trąbka','dudy','gitara','harfa', 'B', 1, 15),"
                    + "('Który instrument ma najbardziej skomplikowaną budowę?','fortepian','klarnet','organy','kontrabas', 'C', 1, 10),"
                    + "('Ile strun mają skrzypce?','1','2','3','4', 'D', 1, 10),"
                    + "('Który instrument nie ma membrany?','bęben','kotły','werbel','trójkąt', 'D', 1, 10),"
                    + "('Instrumentem strunowym szarpanym NIE jest','kontrabas','lutnia','klawesyn','harfa', 'A', 1, 15),"
                    + "('Saksofon jest instrumentem:','elektronicznym','dętym','strunowym','perkusyjnym', 'B', 1, 10),"
                    + "('Która osoba tworzyła gitary?','Leonardo Da Vinci','Mikołaj Kopernik','Antonio Stradivari','Galileusz', 'C', 1, 15),"
                    + "('Który z poniższych instrumentów jest smyczkowy?','fortepian','flet','perkusja','skrzypce', 'D', 1, 10),"
                    + "('Który z instrumentów nie należy do grupy instrumentów dętych drewnianych?','saksofon','rożek angielski','kontrafagot','sakshorn', 'D', 1, 10),"
                    //kategoria kompozytorzy
                    + "('Jakiej narodowości był Beethoven?','niemieckiej','angielskiej','francuskiej','rosyjskiej','A', 2, 10),"
                    + "('Kto jest autorem cyklu Cztery Pory Roku?','Vivaldi','Czajkowski','Mozart','Chopin', 'A', 2, 10),"
                    + "('W którym wieku żył Mozart?','XVII','XIV','XV','XVIII', 'D', 2, 10),"
                    + "('W jakim mieście zmarł Fryderyk Chopin?','Londynie','Paryżu','Warszawie','Berlinie', 'B', 2, 15),"
                    + "('W którym wieku zmarł Stanisław Moniuszko?','XIV','XIX','XX','XVIII', 'B', 2, 20),"
                    + "('Na co cierpiał Beethoven?','na głuchotę','na ślepotę','był niemy','żadna z powyższych', 'A', 2, 10),"
                    + "('Kto skomponował polski hymn?','Mozart','Bach','Wybicki','Chopin', 'C', 2, 15),"
                    + "('Jakiej narodowości był Vivaldi?','hiszpańskiej','portugalskiej','włoskiej','czeskiej', 'C', 2, 15),"
                    + "('Na czyją cześć co 5 lat odbywa się Międzynarodowy Konkurs Pianistyczny?','Bacha','Haydna','Chopina','Beethovena', 'C', 2, 20),"
                    + "('Gdzie znajduje się serce Fryderyka Chopina?','w Krakowie','w Gdańsku','w Poznaniu','w Warszawie', 'D', 2, 15),"
                    + "('W jakim wieku Chopin zaczął komponować?','3 lata','18 lat','7 lat','15 lat', 'C', 2, 20),"
                    + "('W jakim mieście urodził się Fryderyk Chopin?','Londyn','Żelazowa Wola','Paryż','Warszawa', 'B', 2, 10),"
                    + "('Jak miał na drugie imię Mozart?','Sebastian','Wolfgang','Amadeusz','Stanisław', 'C', 2, 20),"
                    + "('Jak miał na imię Beethoven?','Ludwig','Sebastian','Joseph','Fryderyk', 'A', 2, 15),"
                    + "('Beethoven stał się najpierw sławny jako:', 'śpiewak', 'wirtuoz fortepianu','skrzypek','aktor', 'B', 2, 10),"
                    //kategoria notacja
                    + "('Czym jest krzyżyk?','mały krzyż','pająk','rycerz zakonu niemieckiego','znak podwyższający dźwięk','D', 3, 10),"
                    + "('Co to jest bemol?','pomost','znak obniżający dźwięk','rodzaj mola zjadającego nuty','niedołężny człowiek','B', 3, 10),"
                    + "('Co oznacza kropka znajdująca się z prawej strony nuty?','trzeba ten dźwięk zagrać głośno','przedłuża wartość nuty','ostatnią nuta w utworze','dźwięk trzeba zagrać krótko','B', 3, 15),"
                    + "('Co to jest łącznik?','to przeciwieństwo dzielnika','żołnierz przenoszący dokumenty','łuk, który łączy dwie nuty','żadne z powyższych','C', 3, 10),"
                    + "('Co znajduje się na pięcolinii?','nuty','litery','cyfry','wyrazy','A', 3, 10),"
                    + "('Jak inaczej nazywa się klucz wiolinowy?','gitarowy','perkusyjny','skrzypcowy','organowy','C', 3, 10),"
                    + "('Z ilu linii składa się pięciolinia?','2','9','0','5','D', 3, 10),"
                    + "('Która nuta trwa najdłużej?','cała nuta','półnuta','ćwierćnuta','wszystkie trwają tyle samo','A', 3, 10),"
                    + "('Ile razy krócej trwa ćwierćnuta od półnuty?','trwają tyle samo','dwa','cztery','osiem','B', 3, 10),"
                    + "('Co określa pauza?','ile trwa cisza','kiedy widownia może coś zjeść','przerwę w koncercie','nic, w muzyce nie ma pauzy','A', 3, 10),"
                    + "('Ile trwa pauza?','3 sekundy', 'dłużej niż odpowiadająca nuta','sekundę','tyle, ile odpowiadająca nuta','D', 3, 15),"
                    + "('Co oznacza fermata?','wydłużenie trwania nuty','skrócenie trwania nuty','coś się zepsuło','w muzyce nie ma takiego pojęcia','A', 3, 15),"
                    + "('Jak oznaczana jest ćwierćnuta?','przez ćwiartkę koła','jako owalna niewypełniona główka','jako owalna wypełniona główka','owalna wypełniona główka z laską ','D', 3, 10),"
                    + "('Która nuta ma dwie chorągiewki?','szesnastka','ósemka','trzydziestodwójka','półnuta','A', 3, 15),"
                    + "('Ligatura to inaczej:','kropka','nuta','łuk','podział','C', 3, 15),"
                    
                    //do interwalow
                    + "('Jaki to interwał?','pryma czysta','kwarta czysta','sekunda mała','septyma wielka','A', 4, 15),"
                    + "('Jaki to interwał?','pryma czysta','kwarta czysta','sekunda mała','septyma wielka','C', 4, 15),"
                    + "('Jaki to interwał?','sekunda wielka','kwarta czysta','sekunda mała','septyma wielka','A', 4, 15),"
                    + "('Jaki to interwał?','tercja wielka','kwarta czysta','sekunda mała','tercja mała','D', 4, 15),"
                    + "('Jaki to interwał?','septyma mała','oktawa czysta','tryton','tercja wielka','D', 4, 15),"
                    + "('Jaki to interwał?','pryma czysta','kwarta czysta','sekunda mała','septyma wielka','B', 4, 15),"
                    + "('Jaki to interwał?','kwarta zwiększona','kwarta czysta','kwinta czysta','sekunda','A', 4, 15),"
                    + "('Jaki to interwał?','tercja wielka','kwarta czysta','kwinta czysta','tercja mała','C', 4, 15),"
                    + "('Jaki to interwał?','seksta mała','tryton','sekunda mała','seksta wielka','A', 4, 15),"
                    + "('Jaki to interwał?','pryma czysta','kwarta czysta','seksta wielka','septyma wielka','C', 4, 15),"
                    + "('Jaki to interwał?','seksta mała','septyma mała','tryton','oktawa czysta','B', 4, 15),"
                    + "('Jaki to interwał?','septyma wielka','oktawa czysta','tryton','tercja wielka','A', 4, 15),"
                    + "('Jaki to interwał?','septyma mała','oktawa czysta','tryton','tercja wielka','B', 4, 15);";

            stat.executeUpdate(dodajSQL);
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println("Nie mogę dodać danych " + e.getMessage());
        }
    }
}
