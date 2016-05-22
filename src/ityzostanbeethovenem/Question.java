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
    public static Pytanie[] bazaPytan;

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
        //System.out.println(JavaDB.pytania[0].pytanie);
        initComponents();
        initQuestion();
        groupButton();
        setSize(500, 500);
        counter = 0;
        points = 0;
        checkOrNext = true;
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
        jLabel1 = new javax.swing.JLabel();

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

        labelQuestionNumber.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        labelQuestionText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buttonMenu.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        buttonExit.setText("Wyjście");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonA.setBackground(new java.awt.Color(0, 255, 0));
        buttonA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buttonA.setText("aaa");

        buttonB.setBackground(new java.awt.Color(0, 255, 0));
        buttonB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buttonC.setBackground(new java.awt.Color(0, 255, 0));
        buttonC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buttonD.setBackground(new java.awt.Color(0, 255, 0));
        buttonD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buttonSend.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        buttonSend.setText("Sprawdź");
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/tlo.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel1.setMinimumSize(new java.awt.Dimension(750, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelQuestionText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonD, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonB, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonA, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelQuestionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQuestionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(buttonA)
                .addGap(5, 5, 5)
                .addComponent(buttonB)
                .addGap(5, 5, 5)
                .addComponent(buttonC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonD)
                .addGap(45, 45, 45)
                .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExit)
                    .addComponent(buttonMenu))
                .addGap(80, 80, 80))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
        points += JavaDB.pytania[counter].punkty;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelQuestionNumber;
    private javax.swing.JLabel labelQuestionText;
    // End of variables declaration//GEN-END:variables
}
