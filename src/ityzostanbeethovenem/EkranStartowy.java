package ityzostanbeethovenem;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class EkranStartowy extends javax.swing.JFrame {

    public EkranStartowy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pianino = new javax.swing.JButton();
        Quiz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        Pianino.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        Pianino.setForeground(new java.awt.Color(68, 68, 68));
        Pianino.setText("Pianino");
        Pianino.setBorder(null);
        Pianino.setDefaultCapable(false);
        Pianino.setFocusable(false);
        Pianino.setName(""); // NOI18N
        Pianino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PianinoActionPerformed(evt);
            }
        });
        getContentPane().add(Pianino);
        Pianino.setBounds(150, 270, 137, 38);

        Quiz.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        Quiz.setForeground(new java.awt.Color(68, 68, 68));
        Quiz.setText("Quiz");
        Quiz.setBorder(null);
        Quiz.setBorderPainted(false);
        Quiz.setDefaultCapable(false);
        Quiz.setFocusable(false);
        Quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizActionPerformed(evt);
            }
        });
        getContentPane().add(Quiz);
        Quiz.setBounds(150, 220, 137, 38);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/glowna.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PianinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PianinoActionPerformed
        final Piano piano = new Piano();
        piano.setVisible(true);
        close();
    }//GEN-LAST:event_PianinoActionPerformed

    private void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }
    
    private void QuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizActionPerformed
        Quiz quiz = new Quiz();
        quiz.setVisible(true);
        close();
    }//GEN-LAST:event_QuizActionPerformed

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
            java.util.logging.Logger.getLogger(EkranStartowy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkranStartowy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkranStartowy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkranStartowy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkranStartowy().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pianino;
    private javax.swing.JButton Quiz;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    //jLabel1.setText()
}
