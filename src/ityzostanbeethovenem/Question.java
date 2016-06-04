package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;

public class Question extends javax.swing.JFrame {

    public static int counter;
    private static int points;
    private static int number;
    private static int totalPoints;
    
    private static boolean checkOrNext;
    private ArrayList <Integer> randomTable;
    
   
    public Question() {
        initComponents();
        randomQuestions();
        initQuestion(chooseNumber());
        groupButton();
        setSize(500, 500);
        counter = 0;
        points = 0;
        totalPoints = 0;
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

    void initQuestion(int number) {
        enableOrNotButtons(true);
        labelQuestionNumber.setText("Pytanie " + (counter + 1));
        labelQuestionText.setText(JavaDB.pytania[number].pytanie);
        buttonA.setText(JavaDB.pytania[number].odpowiedzA);
        buttonB.setText(JavaDB.pytania[number].odpowiedzB);
        buttonC.setText(JavaDB.pytania[number].odpowiedzC);
        buttonD.setText(JavaDB.pytania[number].odpowiedzD);
        totalPoints += JavaDB.pytania[number].punkty;
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    private int chooseNumber( ) {
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
        labelQuestionText.setText("Treśc bardzo trudnego pytania");
        getContentPane().add(labelQuestionText);
        labelQuestionText.setBounds(230, 60, 871, 146);

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
        menu.setBounds(1240, 662, 50, 50);

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
        exit.setBounds(1300, 670, 50, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents


//GEN-FIRST:event_buttonSendActionPerformed
 
//GEN-LAST:event_buttonSendActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        points = 0;
        totalPoints = 0;
        counter = 0;
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitActionPerformed

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
        String correct = JavaDB.pytania[number].prawidlowa;
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
            QuizEnd a = new QuizEnd(points, totalPoints);
            a.setVisible(true);
            counter = 0;
            points = 0;
            totalPoints = 0;
            close();
        } else {
            initQuestion(chooseNumber());
        }
    }

    void addPoints() {
        points += JavaDB.pytania[number].punkty;
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonSend;
    private javax.swing.JButton exit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel labelQuestionNumber;
    private javax.swing.JLabel labelQuestionText;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
