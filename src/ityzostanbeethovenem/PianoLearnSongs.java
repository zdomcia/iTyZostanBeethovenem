package ityzostanbeethovenem;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.Timer;

public class PianoLearnSongs extends Piano {

    public String songCongratulations;
    public String gifCongratulations;
    public String songToLearn;
    private String songToLearnNotes;

    public PianoLearnSongs() {
        player = new Player();
        //progressCount = 0;
        sequence = "";
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        addKeyboard();
        setSongToLearn("Sto lat");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playSong = new javax.swing.JButton();
        progress = new javax.swing.JProgressBar();
        songChoose = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(810, 450));
        getContentPane().setLayout(null);

        playSong.setBackground(new Color(0,0,0,0));
        playSong.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        playSong.setText("Naucz");
        playSong.setActionCommand("naucz");
        playSong.setFocusable(false);
        playSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playSongActionPerformed(evt);
            }
        });
        getContentPane().add(playSong);
        playSong.setBounds(270, 440, 170, 60);
        getContentPane().add(progress);
        progress.setBounds(510, 440, 170, 40);

        songChoose.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        songChoose.setText("Wybierz piosenkę");
        songChoose.setFocusable(false);
        songChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songChooseActionPerformed(evt);
            }
        });
        getContentPane().add(songChoose);
        songChoose.setBounds(270, 510, 170, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/chatka.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(-170, -430, 1590, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timerPressed(final javax.swing.JButton button, final String note) {
        timer = new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                player.play(note);
                button.getModel().setArmed(true);
                button.getModel().setPressed(true);
            }
        });
    }

    private void timerReleased(final javax.swing.JButton button) {
        timerOff = new Timer(100, new ReleasedKey(button));
    }

    private void playNote(final javax.swing.JButton button, final String note, int timeOn, int timeOff) {
        timerPressed(button, note);
        timerReleased(button);

        timer.setRepeats(false);
        timer.setInitialDelay(timeOn);
        timerOff.setRepeats(false);
        timerOff.setInitialDelay(timeOff);
        timer.start();
        timerOff.start();
    }

    private void playStoLat() {
        playNote(G, "G", 0, 500);
        playNote(E, "E", 1000, 1500);
        playNote(G, "G", 2000, 2500);
        playNote(E, "E", 3000, 3500);
        playNote(G, "G", 4000, 4500);
        playNote(A, "A", 5000, 5250);
        playNote(G, "G", 5500, 5750);
        playNote(F, "F", 6000, 6250);
        playNote(E, "E", 6500, 6750);
        playNote(F, "F", 7000, 7500);
    }

    private void playOda() {
        playNote(E, "E", 0, 250);
        playNote(E, "E", 500, 750);
        playNote(F, "F", 1000, 1250);
        playNote(G, "G", 1500, 1750);
        playNote(G, "G", 2000, 2250);
        playNote(F, "F", 2500, 2750);
        playNote(E, "E", 3000, 3250);
        playNote(D, "D", 3500, 3750);
        playNote(C, "C", 4000, 4250);
        playNote(C, "C", 4500, 4750);
        playNote(D, "D", 5000, 5250);
        playNote(E, "E", 5500, 5750);
        playNote(E, "E", 6000, 6500);
        playNote(D, "D", 6750, 6900);
        playNote(D, "D", 7000, 7500);
    }

    private void playSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playSongActionPerformed

        if ("Sto lat".equals(songToLearn)) {
            playStoLat();
        } else if ("Oda do radości".equals(songToLearn)) {
            playOda();
        }
    }//GEN-LAST:event_playSongActionPerformed

    private void songChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songChooseActionPerformed
        SongChooser songChoosingWindow = new SongChooser(this, true);
        String song = songChoosingWindow.showDialog();
        if (song != null) {
            sequence = "";
            progress.setValue(0);
            setSongToLearn(song);
        }
    }//GEN-LAST:event_songChooseActionPerformed

    @Override
    public void pianoPressed(String note) {
        sequence += note;
        player.play(note);

        

        check();
    }

    protected void check() {
        progress.setValue(sequence.length());
        
        if (sequence.equals(songToLearnNotes)) {
            sequence = "";
            progress.setValue(0);

            openCongratulations(songCongratulations, gifCongratulations);
        } else if (!sequence.equals(songToLearnNotes.substring(0, sequence.length()))) {
            sequence = "";
            progress.setValue(0);
            Player playerWrong = new Player();
            playerWrong.path = "wrong";
            playerWrong.play("");
        }
    }

    private void openCongratulations(String song, String image) {
        final Congratulations congratulations = new Congratulations(song, image);

        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.schedule(new Runnable() {
            public void run() {
                congratulations.setVisible(false);
                congratulations.dispose();
            }
        }, 6, TimeUnit.SECONDS);

        congratulations.setVisible(true);

    }

    private void setSongToLearn(String song) {
        progress.setMinimum(0);

        if ("Oda do radości".equals(song)) {
            songToLearn = "Oda do radości";
            //songToLearnNotes = "EEFGGFEDCCDEEDD";
            songToLearnNotes = "EEF";
            songCongratulations = "cat";
            gifCongratulations = "/Grafika/pizza.gif";
            //progress.setMaximum(15);
            progress.setMaximum(3);
        } else {
            songToLearn = "Sto lat";
            songCongratulations = "when-mom";
            //songToLearnNotes = "GEGEGAGFEF";
            songToLearnNotes = "GEGE";
            gifCongratulations = "/Grafika/kotKrolik.gif";
            //progress.setMaximum(10);
            progress.setMaximum(4);
        }

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
            java.util.logging.Logger.getLogger(PianoLearnSongs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianoLearnSongs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianoLearnSongs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianoLearnSongs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianoLearnSongs().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton playSong;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton songChoose;
    // End of variables declaration//GEN-END:variables
    private Timer timer;
    private Timer timerOff;
}
