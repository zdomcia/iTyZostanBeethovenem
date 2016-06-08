package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Menu extends QuizWindow {

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
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("I Ty możesz zostać Beethovenem");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1250, 800));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        piano.setBackground(new java.awt.Color(189, 204, 204));
        piano.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        piano.setForeground(new java.awt.Color(78, 78, 78));
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
        getContentPane().add(piano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 250, 310, 90));

        quiz.setBackground(new java.awt.Color(189, 204, 204));
        quiz.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        quiz.setForeground(new java.awt.Color(78, 78, 78));
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
        getContentPane().add(quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 360, 310, 90));

        exit.setBackground(new Color(0,0,0,0));
        exit.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        exit.setForeground(new java.awt.Color(2, 40, 21));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/exit.png"))); // NOI18N
        exit.setMaximumSize(new java.awt.Dimension(80, 50));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 40, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/zyrafa.jpg"))); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setAutoscrolls(true);
        jLabel1.setMaximumSize(getMaximumSize());
        jLabel1.setMinimumSize(getMinimumSize());
        jLabel1.setPreferredSize(getPreferredSize());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 2090, 1330));

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pianoActionPerformed
        final PianoWindow piano = new PianoWindow();
        piano.setVisible(true);
        close();
    }//GEN-LAST:event_pianoActionPerformed

    public void close() {
        java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().
                postEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }

    private void quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizActionPerformed
        QuizCategories quiz = new QuizCategories();
        quiz.setVisible(true);
        close();
    }//GEN-LAST:event_quizActionPerformed
    /*
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      */
    public void exitActionPerformed (java.awt.event.ActionEvent evt){
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
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton piano;
    private javax.swing.JButton quiz;
    // End of variables declaration//GEN-END:variables

}
