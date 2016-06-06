package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

public class QuizCategories extends QuizWindow {

    public QuizCategories() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonInstruments = new javax.swing.JButton();
        buttonCompositors = new javax.swing.JButton();
        buttonNotation = new javax.swing.JButton();
        buttonSoundsRecognition = new javax.swing.JButton();
        buttonEverything = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("I Ty możesz zostać Beethovenem");
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 78, 78));
        jLabel1.setText("WYBIERZ KATEGORIĘ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(610, 40, 570, 67);

        buttonInstruments.setBackground(new Color(0,0,0,0));
        buttonInstruments.setFont(new java.awt.Font("Comic Sans MS", 1, 23)); // NOI18N
        buttonInstruments.setForeground(new java.awt.Color(78, 78, 78));
        buttonInstruments.setText("Instrumenty");
        buttonInstruments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstrumentsActionPerformed(evt);
            }
        });
        getContentPane().add(buttonInstruments);
        buttonInstruments.setBounds(740, 120, 290, 70);

        buttonCompositors.setBackground(new Color(0,0,0,0));
        buttonCompositors.setFont(new java.awt.Font("Comic Sans MS", 1, 23)); // NOI18N
        buttonCompositors.setForeground(new java.awt.Color(78, 78, 78));
        buttonCompositors.setText("Kompozytorzy");
        buttonCompositors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompositorsActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCompositors);
        buttonCompositors.setBounds(740, 200, 290, 70);

        buttonNotation.setBackground(new Color(0,0,0,0));
        buttonNotation.setFont(new java.awt.Font("Comic Sans MS", 1, 23)); // NOI18N
        buttonNotation.setForeground(new java.awt.Color(78, 78, 78));
        buttonNotation.setText("Notacja muzyczna");
        buttonNotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNotationActionPerformed(evt);
            }
        });
        getContentPane().add(buttonNotation);
        buttonNotation.setBounds(740, 280, 290, 70);

        buttonSoundsRecognition.setBackground(new Color(0,0,0,0));
        buttonSoundsRecognition.setFont(new java.awt.Font("Comic Sans MS", 1, 23)); // NOI18N
        buttonSoundsRecognition.setForeground(new java.awt.Color(78, 78, 78));
        buttonSoundsRecognition.setText("Interwały");
        buttonSoundsRecognition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSoundsRecognitionActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSoundsRecognition);
        buttonSoundsRecognition.setBounds(740, 360, 290, 70);

        buttonEverything.setBackground(new Color(0,0,0,0));
        buttonEverything.setFont(new java.awt.Font("Comic Sans MS", 1, 23)); // NOI18N
        buttonEverything.setForeground(new java.awt.Color(78, 78, 78));
        buttonEverything.setText("Wszystko");
        buttonEverything.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEverythingActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEverything);
        buttonEverything.setBounds(740, 440, 290, 70);

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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/ogrod.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -150, 1640, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadQuestions(int number) {
        JavaDB db = new JavaDB();
        db.uploadQuestions();
        if (number == 0) {
            db.addQuestions();
        } else {
            db.addQuestionsForCategory(number);
        }
        QuestionWindow q = new QuestionWindow();
        q.setVisible(true);
        close();
    }

    private void buttonInstrumentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstrumentsActionPerformed
        loadQuestions(1);
    }//GEN-LAST:event_buttonInstrumentsActionPerformed

    private void buttonCompositorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompositorsActionPerformed
        loadQuestions(2);
    }//GEN-LAST:event_buttonCompositorsActionPerformed

    private void buttonNotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNotationActionPerformed
        loadQuestions(3);
    }//GEN-LAST:event_buttonNotationActionPerformed

    private void buttonSoundsRecognitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSoundsRecognitionActionPerformed
        loadQuestions(4);
    }//GEN-LAST:event_buttonSoundsRecognitionActionPerformed

    private void buttonEverythingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEverythingActionPerformed
        loadQuestions(0);
    }//GEN-LAST:event_buttonEverythingActionPerformed

    /*
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

    }//GEN-LAST:event_menuActionPerformed

    /*
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    */
    
    
    public void exitActionPerformed(java.awt.event.ActionEvent evt) {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitActionPerformed

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizCategories().setVisible(true);
            }
        });
    }
    /*

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonCompositors;
    private javax.swing.JButton buttonEverything;
    private javax.swing.JButton buttonInstruments;
    private javax.swing.JButton buttonNotation;
    private javax.swing.JButton buttonSoundsRecognition;
    public javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
*/
    
    
    private javax.swing.JButton buttonInstruments;
    private javax.swing.JButton buttonCompositors;
    private javax.swing.JButton buttonNotation;
    private javax.swing.JButton buttonSoundsRecognition;
    private javax.swing.JButton buttonEverything;
    private javax.swing.JLabel jLabel1;

}
