
package ityzostanbeethovenem;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class QuizEnd extends javax.swing.JFrame {

    private static int points;
    
    public QuizEnd() {
        initComponents();
        jLabel2.setText(points + " punktów");
        points = 0;
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }
    
    public QuizEnd( int points) {
        initComponents();
        jLabel2.setText(points + " punktów");
        this.points = points;
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }
    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> Udało Ci się zdobyć <br> <br> </html>");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 90, 370, 180);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 210, 280, 160);

        buttonExit.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        buttonExit.setText("Wyjście");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExit);
        buttonExit.setBounds(550, 570, 170, 90);

        buttonMenu.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMenu);
        buttonMenu.setBounds(550, 430, 170, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        Menu q = new Menu();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        close();
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(QuizEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
