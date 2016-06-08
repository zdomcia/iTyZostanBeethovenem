package ityzostanbeethovenem;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class QuizEnd extends QuizWindow {

    private static String tableOfCats[] = {"balloonOne", "balloons", "meGusta", "thankYou"};

    public QuizEnd(int points, int totalPoints) {
        initComponents();
        summaryLabel1.setText("Zdobyłeś " + points + " punktów");
        summaryLabel2.setText("na " + totalPoints + " możliwych ");

        if ((points / (double) totalPoints) >= 0.3) {
            showCat();
        }

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    private void showCat() {
        Random rand = new Random();
        int los = rand.nextInt(tableOfCats.length - 1);
        openCongratulations("flute", "/Grafika/" + tableOfCats[los] + ".gif", "Gratulacje!");
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        summaryLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        summaryLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("I Ty możesz zostać Beethovenem");
        setAutoRequestFocus(false);
        setExtendedState(MAXIMIZED_BOTH);
        setFocusCycleRoot(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 800));
        getContentPane().setLayout(null);

        summaryLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        summaryLabel1.setForeground(new java.awt.Color(25, 25, 25));
        summaryLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        summaryLabel1.setText("Zdobyłeś 23 punkty");
        getContentPane().add(summaryLabel1);
        summaryLabel1.setBounds(890, 250, 930, 90);

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
        menu.setBounds(1760, 40, 50, 50);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 25, 25));
        jLabel3.setText("To już wszystkie pytania");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1040, 160, 510, 90);

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
        exit.setBounds(1830, 40, 50, 40);

        summaryLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        summaryLabel2.setForeground(new java.awt.Color(25, 25, 25));
        summaryLabel2.setText("na 100 możliwych");
        getContentPane().add(summaryLabel2);
        summaryLabel2.setBounds(1320, 330, 410, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/zyrafa.jpg"))); // NOI18N
        background.setText("Gratu");
        background.setMaximumSize(getMaximumSize());
        background.setMinimumSize(getMinimumSize());
        background.setPreferredSize(getPreferredSize());
        getContentPane().add(background);
        background.setBounds(0, -260, 1920, 1350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

  
    }//GEN-LAST:event_menuActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    */
    public void exitActionPerformed(java.awt.event.ActionEvent evt){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitActionPerformed

    private void openCongratulations(String song, String image, String text) {
        final Congratulations congratulations = new Congratulations(song, image, text);
        congratulations.setAlwaysOnTop(rootPaneCheckingEnabled);
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.schedule(new Runnable() {
            public void run() {
                congratulations.setVisible(true);
                congratulations.dispose();
            }
        }, 10, TimeUnit.SECONDS);

        congratulations.setVisible(true);

    }

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
                new QuizEnd(0, 0).setVisible(true);
            }
        });
    }

    
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton menu;
    private javax.swing.JLabel summaryLabel1;
    private javax.swing.JLabel summaryLabel2;
    // End of variables declaration//GEN-END:variables
    */
    private javax.swing.JLabel summaryLabel1;
    private javax.swing.JLabel summaryLabel2;
    private javax.swing.JLabel jLabel3;
    

}
