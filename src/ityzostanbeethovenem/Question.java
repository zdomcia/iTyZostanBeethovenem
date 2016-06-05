package ityzostanbeethovenem;

public class Question {
    String questionText;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    String correctAnswer;
    int pointsForQuestion;
    int questionCategory;
    
    
    Question ( String p, String qa, String qb, String qc, String qd, String c, int s, int k) {
        questionText = p;
        answerA = qa;
        answerB = qb;
        answerC = qc;
        answerD = qd;
        correctAnswer = c;
        pointsForQuestion  = s;     
        questionCategory = k;
    }
}
