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

    private static String tablicaKotow[] = {"balloonOne", "balloons", "meGusta", "thankYou"};

    public QuizEnd(int points, int totalPoints) {
        initComponents();
        podsumowanieLabel1.setText("Zdobyłeś " + points + " punktów");
        podsumowanieLabel2.setText("na " + totalPoints + " możliwych ");

        if ((points / totalPoints) >= 0.3) {
            pokazKota();
        }

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(true);
    }

    private void pokazKota() {
        Random rand = new Random();
        int los = rand.nextInt(tablicaKotow.length - 1);
        openCongratulations("flute", "/Grafika/" + tablicaKotow[los] + ".gif", "Gratulacje!");
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        podsumowanieLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        podsumowanieLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1250, 800));
        getContentPane().setLayout(null);

        podsumowanieLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        podsumowanieLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        podsumowanieLabel1.setText("Zdobyłeś 23 punkty");
        getContentPane().add(podsumowanieLabel1);
        podsumowanieLabel1.setBounds(350, 190, 930, 90);

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

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setText("To już wszystkie pytania");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 60, 510, 80);

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

        podsumowanieLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        podsumowanieLabel2.setText("na 100 możliwych");
        getContentPane().add(podsumowanieLabel2);
        podsumowanieLabel2.setBounds(750, 270, 320, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/trawka.jpg"))); // NOI18N
        background.setText("Gratu");
        getContentPane().add(background);
        background.setBounds(10, -240, 1130, 880);

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
    private javax.swing.JLabel podsumowanieLabel1;
    private javax.swing.JLabel podsumowanieLabel2;
    // End of variables declaration//GEN-END:variables
    */
    private javax.swing.JLabel podsumowanieLabel1;
    private javax.swing.JLabel podsumowanieLabel2;
    private javax.swing.JLabel jLabel3;
    

}
