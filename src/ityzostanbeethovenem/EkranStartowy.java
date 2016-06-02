package ityzostanbeethovenem;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class EkranStartowy extends javax.swing.JFrame {

    public EkranStartowy() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pianino = new javax.swing.JButton();
        Quiz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1250, 800));
        setPreferredSize(new java.awt.Dimension(450, 450));
        getContentPane().setLayout(null);

        Pianino.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Pianino.setForeground(new java.awt.Color(98, 114, 130));
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
        Pianino.setBounds(830, 220, 330, 80);

        Quiz.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Quiz.setForeground(new java.awt.Color(98, 114, 130));
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
        Quiz.setBounds(830, 120, 330, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/zyrafa.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -270, 1920, 1190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PianinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PianinoActionPerformed
        final PianoWindow piano = new PianoWindow();
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
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    //jLabel1.setText()
}
