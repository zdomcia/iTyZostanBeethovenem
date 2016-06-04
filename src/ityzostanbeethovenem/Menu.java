package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piano = new javax.swing.JButton();
        quiz = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1250, 800));
        getContentPane().setLayout(null);

        piano.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        piano.setForeground(new java.awt.Color(98, 114, 130));
        piano.setText("Pianino");
        piano.setBorder(null);
        piano.setDefaultCapable(false);
        piano.setFocusable(false);
        piano.setName(""); // NOI18N
        piano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pianoActionPerformed(evt);
            }
        });
        getContentPane().add(piano);
        piano.setBounds(830, 220, 330, 80);

        quiz.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        quiz.setForeground(new java.awt.Color(98, 114, 130));
        quiz.setText("Quiz");
        quiz.setBorder(null);
        quiz.setBorderPainted(false);
        quiz.setDefaultCapable(false);
        quiz.setFocusable(false);
        quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizActionPerformed(evt);
            }
        });
        getContentPane().add(quiz);
        quiz.setBounds(830, 120, 330, 80);

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

        background.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/zyrafa.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -270, 1920, 1190);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pianoActionPerformed
        final PianoWindow piano = new PianoWindow();
        piano.setVisible(true);
        close();
    }//GEN-LAST:event_pianoActionPerformed

    private void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }

    private void quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizActionPerformed
        QuizCategories quiz = new QuizCategories();
        quiz.setVisible(true);
        close();
    }//GEN-LAST:event_quizActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JButton piano;
    private javax.swing.JButton quiz;
    // End of variables declaration//GEN-END:variables

}
