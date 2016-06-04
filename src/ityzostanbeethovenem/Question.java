package ityzostanbeethovenem;

public class Question {
    String pytanie;
    String odpowiedzA;
    String odpowiedzB;
    String odpowiedzC;
    String odpowiedzD;
    String prawidlowa;
    int punkty;
    int kategoria;
    
    
    Question ( String p, String qa, String qb, String qc, String qd, String c, int s, int k) {
        pytanie = p;
        odpowiedzA = qa;
        odpowiedzB = qb;
        odpowiedzC = qc;
        odpowiedzD = qd;
        prawidlowa = c;
        punkty  = s;     
        kategoria = k;
    }
}
