package ityzostanbeethovenem;

import javax.swing.ImageIcon;

public class PianoWindow extends Piano {

    public PianoWindow() {
        player = new Player();
        sequence = "";
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        addKeyboard();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        learnSongs = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(810, 450));
        getContentPane().setLayout(null);

        learnSongs.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        learnSongs.setText("Naucz się grać piosenkę");
        learnSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnSongsActionPerformed(evt);
            }
        });
        getContentPane().add(learnSongs);
        learnSongs.setBounds(813, 220, 180, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/chatka.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(-170, -430, 1590, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void learnSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnSongsActionPerformed
        PianoLearnSongs piano = new PianoLearnSongs();
        piano.setVisible(true);
        dispose();
    }//GEN-LAST:event_learnSongsActionPerformed



    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PianoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianoWindow().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton learnSongs;
    // End of variables declaration//GEN-END:variables
}
