package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class QuizCategories extends javax.swing.JFrame {//javax.swing.JFrame {

    public QuizCategories() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonInstrumenty = new javax.swing.JButton();
        buttonKompozytorzy = new javax.swing.JButton();
        buttonNotacja = new javax.swing.JButton();
        buttonRozpoznawanieDzwiekow = new javax.swing.JButton();
        buttonWszystko = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel1.setText("WYBIERZ KATEGORIĘ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 40, 570, 67);

        buttonInstrumenty.setBackground(new Color(0,0,0,0));
        buttonInstrumenty.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        buttonInstrumenty.setText("Instrumenty");
        buttonInstrumenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstrumentyActionPerformed(evt);
            }
        });
        getContentPane().add(buttonInstrumenty);
        buttonInstrumenty.setBounds(800, 110, 290, 70);

        buttonKompozytorzy.setBackground(new Color(0,0,0,0));
        buttonKompozytorzy.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        buttonKompozytorzy.setText("Kompozytorzy");
        buttonKompozytorzy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKompozytorzyActionPerformed(evt);
            }
        });
        getContentPane().add(buttonKompozytorzy);
        buttonKompozytorzy.setBounds(800, 190, 290, 70);

        buttonNotacja.setBackground(new Color(0,0,0,0));
        buttonNotacja.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        buttonNotacja.setText("Notacja muzyczna");
        buttonNotacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNotacjaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonNotacja);
        buttonNotacja.setBounds(800, 270, 290, 70);

        buttonRozpoznawanieDzwiekow.setBackground(new Color(0,0,0,0));
        buttonRozpoznawanieDzwiekow.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        buttonRozpoznawanieDzwiekow.setText("Dźwięki");
        buttonRozpoznawanieDzwiekow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRozpoznawanieDzwiekowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRozpoznawanieDzwiekow);
        buttonRozpoznawanieDzwiekow.setBounds(800, 350, 290, 70);

        buttonWszystko.setBackground(new Color(0,0,0,0));
        buttonWszystko.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        buttonWszystko.setText("Wszystko");
        buttonWszystko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWszystkoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonWszystko);
        buttonWszystko.setBounds(800, 430, 290, 70);

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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/trawka.jpg"))); // NOI18N
        background.setText("jLabel2");
        getContentPane().add(background);
        background.setBounds(-10, -180, 1470, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zaladujPytania (int number) {
        JavaDB db = new JavaDB();
        db.uploadQuestions();
        if ( number == 0){
            db.dodajPytania();
        }else {
            db.dodajPytaniaKategorii(number);
        }
        QuestionWindow q = new QuestionWindow();
        q.setVisible(true);
        close();
    }
    
    private void buttonInstrumentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstrumentyActionPerformed
        zaladujPytania(1);
    }//GEN-LAST:event_buttonInstrumentyActionPerformed

    private void buttonKompozytorzyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKompozytorzyActionPerformed
        zaladujPytania(2);
    }//GEN-LAST:event_buttonKompozytorzyActionPerformed

    private void buttonNotacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNotacjaActionPerformed
        zaladujPytania(3);
    }//GEN-LAST:event_buttonNotacjaActionPerformed

    private void buttonRozpoznawanieDzwiekowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRozpoznawanieDzwiekowActionPerformed
        zaladujPytania(4);
    }//GEN-LAST:event_buttonRozpoznawanieDzwiekowActionPerformed

    private void buttonWszystkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWszystkoActionPerformed
        zaladujPytania(0);
    }//GEN-LAST:event_buttonWszystkoActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
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
    private javax.swing.JButton buttonInstrumenty;
    private javax.swing.JButton buttonKompozytorzy;
    private javax.swing.JButton buttonNotacja;
    private javax.swing.JButton buttonRozpoznawanieDzwiekow;
    private javax.swing.JButton buttonWszystko;
    public javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
*/
    
    
    private javax.swing.JButton buttonInstrumenty;
    private javax.swing.JButton buttonKompozytorzy;
    private javax.swing.JButton buttonNotacja;
    private javax.swing.JButton buttonRozpoznawanieDzwiekow;
    private javax.swing.JButton buttonWszystko;
    private javax.swing.JLabel jLabel1;

}
