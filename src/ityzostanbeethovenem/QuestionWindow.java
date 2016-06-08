package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class QuestionWindow extends QuizWindow {

    public static int counter;
    private static int points;
    private static int number;
    private static int totalPoints;
    public Question actualQuestion;

    private static boolean checkOrNext;
    private ArrayList<Integer> randomTable;

    public QuestionWindow() {
        initComponents();
        addListener();
        randomQuestions();
        clearConstantValues();
        initQuestion(chooseNumber());
        groupButton();
        setSize(500, 500);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    void clearConstantValues() {
        counter = 0;
        points = 0;
        totalPoints = 0;
        checkOrNext = true;
    }

    void clearBackground() {
        buttonA.setForeground(Color.black);
        buttonB.setForeground(Color.black);
        buttonC.setForeground(Color.black);
        buttonD.setForeground(Color.black);
    }

    void initQuestion(int number) {
        enableOrNotButtons(true);
        buttonSend.setEnabled(false);
        actualQuestion = new Question(JavaDB.questions[number].questionText, JavaDB.questions[number].answerA,
                JavaDB.questions[number].answerB, JavaDB.questions[number].answerC,
                JavaDB.questions[number].answerD, JavaDB.questions[number].correctAnswer,
                JavaDB.questions[number].pointsForQuestion, JavaDB.questions[number].questionCategory);

        updateFields();
    }

    void updateFields() {
        labelQuestionNumber.setText("Pytanie " + (counter + 1));
        labelQuestionText.setText(actualQuestion.questionText);

        buttonA.setText(actualQuestion.answerA);
        buttonB.setText(actualQuestion.answerB);
        buttonC.setText(actualQuestion.answerC);
        buttonD.setText(actualQuestion.answerD);
        totalPoints += actualQuestion.pointsForQuestion;

        if (actualQuestion.questionText.equals("Jaki to interwał?")) {
            playInterval(number);
            powtorzButton.setText("Powtórz");
            powtorzButton.setVisible(true);
        } else {
            powtorzButton.setVisible(false);
        }
    }

    public void playInterval(int number) {
        Player player = new Player();
        String correct = actualQuestion.correctAnswer;
        String name = "";

        switch (correct) {
            case "A":
                name = actualQuestion.answerA;
                break;
            case "B":
                name = actualQuestion.answerB;
                break;
            case "C":
                name = actualQuestion.answerC;
                break;
            case "D":
                name = actualQuestion.answerD;
                break;
        }

        player.path = name;
        player.play("");
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    private int chooseNumber() {
        Random rand = new Random();
        int los = rand.nextInt(randomTable.size() - 1);
        number = randomTable.get(los);
        randomTable.remove(los);
        return number;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        labelQuestionNumber = new javax.swing.JLabel();
        labelQuestionText = new javax.swing.JLabel();
        buttonA = new javax.swing.JRadioButton();
        buttonB = new javax.swing.JRadioButton();
        buttonC = new javax.swing.JRadioButton();
        buttonD = new javax.swing.JRadioButton();
        buttonSend = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        powtorzButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("I Ty możesz zostać Beethovenem");
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 800));
        getContentPane().setLayout(null);

        labelQuestionNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        labelQuestionNumber.setForeground(new java.awt.Color(78, 78, 78));
        labelQuestionNumber.setText("Pytanie nr 1");
        getContentPane().add(labelQuestionNumber);
        labelQuestionNumber.setBounds(1210, 120, 160, 59);

        labelQuestionText.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        labelQuestionText.setForeground(new java.awt.Color(78, 78, 78));
        labelQuestionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQuestionText.setText("Treśc bardzo trudnego pytania");
        getContentPane().add(labelQuestionText);
        labelQuestionText.setBounds(820, 180, 871, 40);

        buttonA.setBackground(new java.awt.Color(0, 255, 0));
        buttonA.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        buttonA.setForeground(new java.awt.Color(78, 78, 78));
        buttonA.setText("aaa");
        getContentPane().add(buttonA);
        buttonA.setBounds(1190, 260, 380, 54);

        buttonB.setBackground(new java.awt.Color(0, 255, 0));
        buttonB.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        buttonB.setForeground(new java.awt.Color(78, 78, 78));
        getContentPane().add(buttonB);
        buttonB.setBounds(1190, 330, 380, 54);

        buttonC.setBackground(new java.awt.Color(0, 255, 0));
        buttonC.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        buttonC.setForeground(new java.awt.Color(78, 78, 78));
        getContentPane().add(buttonC);
        buttonC.setBounds(1190, 400, 380, 54);

        buttonD.setBackground(new java.awt.Color(0, 255, 0));
        buttonD.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        buttonD.setForeground(new java.awt.Color(78, 78, 78));
        getContentPane().add(buttonD);
        buttonD.setBounds(1190, 470, 380, 54);

        buttonSend.setBackground(new java.awt.Color(189, 204, 204));
        buttonSend.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        buttonSend.setForeground(new java.awt.Color(78, 78, 78));
        buttonSend.setText("Sprawdź");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSend);
        buttonSend.setBounds(1410, 580, 180, 60);

        menu.setBackground(new Color(0,0,0,0));
        menu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(2, 40, 21));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/home.png"))); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(1760, 40, 50, 50);

        exit.setBackground(new Color(0,0,0,0));
        exit.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(2, 40, 21));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/exit.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(1830, 40, 50, 40);

        powtorzButton.setBackground(new java.awt.Color(189, 204, 204));
        powtorzButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        powtorzButton.setForeground(new java.awt.Color(78, 78, 78));
        powtorzButton.setText("Powtórz");
        powtorzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powtorzButtonActionPerformed(evt);
            }
        });
        getContentPane().add(powtorzButton);
        powtorzButton.setBounds(1190, 580, 180, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/trawka.jpg"))); // NOI18N
        background.setAutoscrolls(true);
        background.setMaximumSize(getMaximumSize());
        background.setMinimumSize(getMinimumSize());
        background.setPreferredSize(getPreferredSize());
        getContentPane().add(background);
        background.setBounds(0, -130, 1950, 1320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//GEN-FIRST:event_buttonSendActionPerformed
 
//GEN-LAST:event_buttonSendActionPerformed
    /*
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

    }//GEN-LAST:event_menuActionPerformed
*/
    public void menuActionPerformed(java.awt.event.ActionEvent evt) {
        clearConstantValues();
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }

    /*
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      */
    public void exitActionPerformed(java.awt.event.ActionEvent evt) {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitActionPerformed

    private void powtorzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powtorzButtonActionPerformed
        playInterval(number);
    }//GEN-LAST:event_powtorzButtonActionPerformed

    private void groupButton() {
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(buttonA);
        buttonGroup1.add(buttonB);
        buttonGroup1.add(buttonC);
        buttonGroup1.add(buttonD);
    }

    private void enableOrNotButtons(boolean flag) {
        buttonA.setEnabled(flag);
        buttonB.setEnabled(flag);
        buttonC.setEnabled(flag);
        buttonD.setEnabled(flag);
    }

    private boolean checkAnswer() {
        String correct = actualQuestion.correctAnswer;
        enableOrNotButtons(false);

        switch (correct) {
            case "A":
                buttonA.setForeground(Color.GREEN);
                if (buttonA.isSelected()) {
                    return true;
                }
                return false;

            case "B":
                buttonB.setForeground(Color.GREEN);
                if (buttonB.isSelected()) {
                    return true;
                }
                return false;

            case "C":
                buttonC.setForeground(Color.GREEN);
                if (buttonC.isSelected()) {
                    return true;
                }
                return false;
            case "D":
                buttonD.setForeground(Color.GREEN);
                if (buttonD.isSelected()) {
                    return true;
                }
                return false;
        }
        return false;
    }

    void randomQuestions() {
        int length = JavaDB.size;
        randomTable = new ArrayList();
        for (int i = 0; i < length; i++) {
            randomTable.add(i);
        }
    }

    void nextQuestion() {
        counter++;
        if (counter >= 10) {
            QuizEnd q = new QuizEnd(points, totalPoints);
            q.setVisible(true);
            clearConstantValues();
            dispose();
        } else {
            initQuestion(chooseNumber());
            buttonGroup1.clearSelection();
        }

    }

    void addListener() {
        buttonSend.setEnabled(false);
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buttonSend.setEnabled(true);
            }
        });
         buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buttonSend.setEnabled(true);
            }
        });
          buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buttonSend.setEnabled(true);
            }
        });
           buttonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buttonSend.setEnabled(true);
            }
        });
           
           
    }

    void addPoints() {
        points += actualQuestion.pointsForQuestion;
    }

    void colorBadAnswer() {
        if (buttonA.isSelected()) {
            buttonA.setForeground(Color.red);
        } else if (buttonB.isSelected()) {
            buttonB.setForeground(Color.red);
        } else if (buttonC.isSelected()) {
            buttonC.setForeground(Color.red);
        } else {
            buttonD.setForeground(Color.red);
        }
    }

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {

        if (checkOrNext) {
            Player player = new Player();
            if (checkAnswer()) {
                addPoints();
                player.path = "correct";
            } else {
                colorBadAnswer();
                player.path = "wrong";
            }
            buttonSend.setText("Dalej");
            checkOrNext = false;
            player.play("");
        } else {
            clearBackground();
            try {
                nextQuestion();
            } catch (Exception e) {

            }
            checkOrNext = true;
            buttonSend.setText("Sprawdź");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionWindow().setVisible(true);
            }
        });
    }

    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JRadioButton buttonA;
    private javax.swing.JRadioButton buttonB;
    private javax.swing.JRadioButton buttonC;
    private javax.swing.JRadioButton buttonD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonSend;
    private javax.swing.JButton exit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel labelQuestionNumber;
    private javax.swing.JLabel labelQuestionText;
    private javax.swing.JButton menu;
    private javax.swing.JButton powtorzButton;
    // End of variables declaration//GEN-END:variables
*/
    private javax.swing.JRadioButton buttonA;
    private javax.swing.JRadioButton buttonB;
    private javax.swing.JRadioButton buttonC;
    private javax.swing.JRadioButton buttonD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonSend;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel labelQuestionNumber;
    private javax.swing.JLabel labelQuestionText;
    private javax.swing.JButton powtorzButton;

}
