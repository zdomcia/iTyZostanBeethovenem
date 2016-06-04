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

        learnSongs.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        learnSongs.setForeground(new java.awt.Color(76, 76, 76));
        learnSongs.setText("Naucz się grać piosenkę");
        learnSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnSongsActionPerformed(evt);
            }
        });
        getContentPane().add(learnSongs);
        learnSongs.setBounds(710, 170, 310, 70);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton learnSongs;
    // End of variables declaration//GEN-END:variables
}
