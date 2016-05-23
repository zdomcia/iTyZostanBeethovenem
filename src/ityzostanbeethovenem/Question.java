package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;

public class Question extends javax.swing.JFrame {

    public static int counter;
    private static int points;
    private String[] questions = {"Kto ma najlepszy projekt z IO?",
        "Który z poniższych instrumentów jest smyczkowy?",
        "Jak nazywa się gama z podwyższonym 7. stopniem?",
        "Który z poniższych tańców pochodzi z Polski?",
        "Jaki znak służy podwyższeniu dźwięku o pół tonu?",
        "Który z instrumentów nie należy do instrumentów dętych drewnianych?",
        "Której z operr nie skomponował Mozart?",
        "W jakim mieście zmarł Fryderyk Chopin?",
        "Co oznacza słowo volta?",
        "Który instrument nie ma membrany?", "p11"};

    private String[][] answers = {{"MozartTeam", "BeethovenTeam", "VivaldiTeam", "HaydnTeam"},
    {"fortepian", "skrzypce", "flet", "perkusja"},
    {"harmoniczna", "eolska", "dorycka", "melodyczna"},
    {"polka", "polonez", "zorba", "czardasz"},
    {"#", "b", "!", "^"},
    {"saksofon", "rożek angielski", "kontrafagot", "sakshorn"},
    {"Wesele Figara", "Uprowadzenie z Seraju", "Cyrulik sewilski", "Czarodziejski flet"},
    {"Londyn", "Żelazowa Wola", "Paryż", "Warszawa"},
    {"Nazwisko włoskiego kompozytora", "Rodzaj popularnego tańca dworskiego",
        "Jedno z dwóch różnych zakończeń utworu", "rodzaj gamy"},
    {"bęben", "kotły", "werbel", "trójkąt"}};

    private String[] correctAnswer = {"b", "b", "a", "b", "a", "d", "c", "c", "c", "d"};
    private static boolean checkOrNext;

    public Question() {
        initComponents();
        initQuestion();
        groupButton();
        setSize(500, 500);
        counter = 0;
        points = 0;
        checkOrNext = true;
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);

    }

    void clearBackground() {
        buttonA.setOpaque(false);
        buttonA.repaint();
        buttonB.setOpaque(false);
        buttonB.repaint();
        buttonC.setOpaque(false);
        buttonC.repaint();
        buttonD.setOpaque(false);
        buttonD.repaint();
    }

    void initQuestion() {
        enableOrNotButtons(true);
        labelQuestionNumber.setText("Pytanie " + (counter + 1));
        labelQuestionText.setText(JavaDB.pytania[counter].pytanie);
        buttonA.setText(JavaDB.pytania[counter].odpowiedzA);
        buttonB.setText(JavaDB.pytania[counter].odpowiedzB);
        buttonC.setText(JavaDB.pytania[counter].odpowiedzC);
        buttonD.setText(JavaDB.pytania[counter].odpowiedzD);
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        labelQuestionNumber = new javax.swing.JLabel();
        labelQuestionText = new javax.swing.JLabel();
        buttonMenu = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonA = new javax.swing.JRadioButton();
        buttonB = new javax.swing.JRadioButton();
        buttonC = new javax.swing.JRadioButton();
        buttonD = new javax.swing.JRadioButton();
        buttonSend = new javax.swing.JButton();

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
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 800));
        getContentPane().setLayout(null);

        labelQuestionNumber.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        getContentPane().add(labelQuestionNumber);
        labelQuestionNumber.setBounds(510, 20, 330, 59);

        labelQuestionText.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        getContentPane().add(labelQuestionText);
        labelQuestionText.setBounds(440, 70, 871, 146);

        buttonMenu.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMenu);
        buttonMenu.setBounds(50, 590, 137, 57);

        buttonExit.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        buttonExit.setText("Wyjście");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExit);
        buttonExit.setBounds(50, 660, 137, 57);

        buttonA.setBackground(new java.awt.Color(0, 255, 0));
        buttonA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonA.setText("aaa");
        getContentPane().add(buttonA);
        buttonA.setBounds(510, 230, 317, 54);

        buttonB.setBackground(new java.awt.Color(0, 255, 0));
        buttonB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        getContentPane().add(buttonB);
        buttonB.setBounds(510, 300, 317, 54);

        buttonC.setBackground(new java.awt.Color(0, 255, 0));
        buttonC.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });
        getContentPane().add(buttonC);
        buttonC.setBounds(510, 370, 317, 54);

        buttonD.setBackground(new java.awt.Color(0, 255, 0));
        buttonD.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        getContentPane().add(buttonD);
        buttonD.setBounds(510, 440, 317, 54);

        buttonSend.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        buttonSend.setText("Sprawdź");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSend);
        buttonSend.setBounds(590, 530, 166, 57);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        EkranStartowy q = new EkranStartowy();
        q.setVisible(true);
        counter = 0;
        close();
    }//GEN-LAST:event_buttonMenuActionPerformed


    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        counter = 0;
        close();
    }//GEN-LAST:event_buttonExitActionPerformed

//GEN-FIRST:event_buttonSendActionPerformed
 
//GEN-LAST:event_buttonSendActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCActionPerformed

    private void groupButton() {
        ButtonGroup group = new ButtonGroup();

        group.add(buttonA);
        group.add(buttonB);
        group.add(buttonC);
        group.add(buttonD);

    }

    private void enableOrNotButtons(boolean flag) {
        buttonA.setEnabled(flag);
        buttonB.setEnabled(flag);
        buttonC.setEnabled(flag);
        buttonD.setEnabled(flag);
    }

    private boolean checkAnswer() {
        String correct = JavaDB.pytania[counter].prawidlowa;
        enableOrNotButtons(false);

        switch (correct) {

            case "A":
                buttonA.setBackground(Color.GREEN);
                buttonA.setOpaque(true);
                buttonA.repaint();
                if (buttonA.isSelected()) {
                    return true;
                }
                return false;

            case "B":
                buttonB.setBackground(Color.GREEN);
                buttonB.setOpaque(true);
                buttonB.repaint();
                if (buttonB.isSelected()) {
                    return true;
                }
                return false;

            case "C":
                buttonC.setBackground(Color.GREEN);
                buttonC.setOpaque(true);
                buttonC.repaint();
                if (buttonC.isSelected()) {
                    return true;
                }
                return false;
            case "D":
                buttonD.setBackground(Color.GREEN);
                buttonD.setOpaque(true);
                buttonD.repaint();
                if (buttonD.isSelected()) {
                    return true;
                }
                return false;
        }

        return false;
    }

    void nextQuestion() {
        counter++;
        if (counter >= 10) {
            QuizEnd a = new QuizEnd(points);
            a.setVisible(true);
            counter = 0;
            close();
        } else {
            initQuestion();
        }
    }

    void addPoints() {
        points += 10;
    }

    void colorBadAnswer() {
        if (buttonA.isSelected()) {
            buttonA.setBackground(Color.red);
            buttonA.setOpaque(true);
            buttonA.repaint();
        } else if (buttonB.isSelected()) {
            buttonB.setBackground(Color.red);
            buttonB.setOpaque(true);
            buttonB.repaint();
        } else if (buttonC.isSelected()) {
            buttonC.setBackground(Color.red);
            buttonC.setOpaque(true);
            buttonC.repaint();
        } else {
            buttonD.setBackground(Color.red);
            buttonD.setOpaque(true);
            buttonD.repaint();
        }
    }

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {
        if (checkOrNext) {
            if (checkAnswer()) {
                addPoints();
            } else {
                colorBadAnswer();
            }

            buttonSend.setText("Dalej");
            checkOrNext = false;
        } else {
            clearBackground();
            nextQuestion();

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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonA;
    private javax.swing.JRadioButton buttonB;
    private javax.swing.JRadioButton buttonC;
    private javax.swing.JRadioButton buttonD;
    private javax.swing.JButton buttonExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonSend;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel labelQuestionNumber;
    private javax.swing.JLabel labelQuestionText;
    // End of variables declaration//GEN-END:variables
}
