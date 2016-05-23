package ityzostanbeethovenem;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class QuizCategories extends javax.swing.JFrame {

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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("WYBIERZ KATEGORIĘ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 50, 470, 32);

        buttonInstrumenty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonInstrumenty.setText("Instrumenty");
        buttonInstrumenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstrumentyActionPerformed(evt);
            }
        });
        getContentPane().add(buttonInstrumenty);
        buttonInstrumenty.setBounds(480, 120, 290, 70);

        buttonKompozytorzy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonKompozytorzy.setText("Kompozytorzy");
        buttonKompozytorzy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKompozytorzyActionPerformed(evt);
            }
        });
        getContentPane().add(buttonKompozytorzy);
        buttonKompozytorzy.setBounds(480, 220, 290, 70);

        buttonNotacja.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonNotacja.setText("Notacja muzyczna");
        buttonNotacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNotacjaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonNotacja);
        buttonNotacja.setBounds(480, 320, 290, 70);

        buttonRozpoznawanieDzwiekow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonRozpoznawanieDzwiekow.setText("Dźwięki");
        buttonRozpoznawanieDzwiekow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRozpoznawanieDzwiekowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRozpoznawanieDzwiekow);
        buttonRozpoznawanieDzwiekow.setBounds(480, 420, 290, 70);

        buttonWszystko.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonWszystko.setText("Wszystko");
        buttonWszystko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWszystkoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonWszystko);
        buttonWszystko.setBounds(480, 520, 290, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 650, 290, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInstrumentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstrumentyActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(1);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonInstrumentyActionPerformed

    private void buttonKompozytorzyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKompozytorzyActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(2);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonKompozytorzyActionPerformed

    private void buttonNotacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNotacjaActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(3);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonNotacjaActionPerformed

    private void buttonRozpoznawanieDzwiekowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRozpoznawanieDzwiekowActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(4);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonRozpoznawanieDzwiekowActionPerformed

    private void buttonWszystkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWszystkoActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytania();
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonWszystkoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EkranStartowy q = new EkranStartowy();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInstrumenty;
    private javax.swing.JButton buttonKompozytorzy;
    private javax.swing.JButton buttonNotacja;
    private javax.swing.JButton buttonRozpoznawanieDzwiekow;
    private javax.swing.JButton buttonWszystko;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
