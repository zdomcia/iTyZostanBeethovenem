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
    public String textCongratulations;

    public String songToLearn;
    private String songToLearnNotes;

    public PianoLearnSongs() {
        player = new Player();
        progressCount = 0;
        sequence = "";
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        addKeyboard();
        setSongToLearn("Sto lat");

        tryAgain.setVisible(false);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tryAgain = new javax.swing.JLabel();
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

        tryAgain.setBackground(new Color(0, 0, 0, 0));
        tryAgain.setFont(new java.awt.Font("Comic Sans MS", 1, 180)); // NOI18N
        tryAgain.setText("Jeszcze raz");
        getContentPane().add(tryAgain);
        tryAgain.setBounds(160, 200, 1400, 460);

        playSong.setBackground(new java.awt.Color(189, 204, 204));
        playSong.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        playSong.setForeground(new java.awt.Color(73, 73, 79));
        playSong.setText("Naucz");
        playSong.setActionCommand("naucz");
        playSong.setFocusable(false);
        playSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playSongActionPerformed(evt);
            }
        });
        getContentPane().add(playSong);
        playSong.setBounds(150, 460, 290, 60);

        progress.setMaximum(15);
        getContentPane().add(progress);
        progress.setBounds(150, 380, 290, 60);

        songChoose.setBackground(new java.awt.Color(189, 204, 204));
        songChoose.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        songChoose.setForeground(new java.awt.Color(73, 73, 79));
        songChoose.setText("Wybierz piosenkę");
        songChoose.setFocusable(false);
        songChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songChooseActionPerformed(evt);
            }
        });
        getContentPane().add(songChoose);
        songChoose.setBounds(150, 530, 290, 60);

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

    private void playVSymphony() {
        playNote(G, "G", 0, 250);
        playNote(G, "G", 500, 750);
        playNote(G, "G", 1000, 1250);
        playNote(Dis, "Dis", 1500, 2250);
        playNote(F, "F", 3000, 3250);
        playNote(F, "F", 3500, 3750);
        playNote(F, "F", 4000, 4250);
        playNote(D, "D", 4500, 4750);
    }

    private void playOdeToJoy() {
        playNote(Fis, "Fis", 0, 250);
        playNote(Fis, "Fis", 500, 750);
        playNote(G, "G", 1000, 1250);
        playNote(A, "A", 1500, 1750);
        playNote(A, "A", 2000, 2250);
        playNote(G, "G", 2500, 2750);
        playNote(Fis, "Fis", 3000, 3250);
        playNote(E, "E", 3500, 3750);
        playNote(D, "D", 4000, 4250);
        playNote(D, "D", 4500, 4750);
        playNote(E, "E", 5000, 5250);
        playNote(Fis, "Fis", 5500, 5750);
        playNote(Fis, "Fis", 6000, 6500);
        playNote(E, "E", 6750, 6900);
        playNote(E, "E", 7000, 7500);
    }

    private void playFurElise() {
        playNote(E1, "E1", 0, 250);
        playNote(Dis1, "Dis1", 500, 750);
        playNote(E1, "E1", 1000, 1250);
        playNote(Dis1, "Dis1", 1500, 1750);
        playNote(E1, "E1", 2000, 2250);
        playNote(H, "H", 2500, 2750);
        playNote(D1, "D1", 3000, 3250);
        playNote(C1, "C1", 3500, 3750);
        playNote(A, "A", 4000, 4250);
    }

    private void playSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playSongActionPerformed

        zeroProgress();
        switch (songToLearn) {
            case "Oda do radości":
                playOdeToJoy();
                break;
            case "Dla Elizy":
                playFurElise();
                break;
            default:
                playVSymphony();
                break;
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
        progressCount++;
        player.play(note);
        check();
    }

    private void zeroProgress() {
        sequence = "";
        progress.setValue(0);
        progressCount = 0;
    }

    protected void check() {
        progress.setValue(progressCount);

        if (sequence.equals(songToLearnNotes)) {
            zeroProgress();

            openCongratulations(songCongratulations, gifCongratulations, textCongratulations);
        } else if (!sequence.equals(songToLearnNotes.substring(0, sequence.length()))) {
            zeroProgress();
            Player playerWrong = new Player();
            playerWrong.path = "wrong";
            playerWrong.play("");

            showLabel();
        }
    }

    private void showLabel() {

        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.schedule(new Runnable() {
            public void run() {
                tryAgain.setVisible(false);
            }
        }, 1, TimeUnit.SECONDS);

        tryAgain.setVisible(true);

    }

    private void openCongratulations(String song, String image, String text) {
        final Congratulations congratulations = new Congratulations(song, image, text);

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

        switch (song) {
            case "Oda do radości":
                songToLearn = "Oda do radości";
                songToLearnNotes = "FisFisGAAGFisEDDEFisFisEE";
                songCongratulations = "cat";
                gifCongratulations = "/Grafika/pizza.gif";
                textCongratulations = "SUPER!";
                progress.setMaximum(15);
                break;
            case "Dla Elizy":
                songToLearn = "Dla Elizy";
                songCongratulations = "witch";
                songToLearnNotes = "E1Dis1E1Dis1E1HD1C1A";
                gifCongratulations = "/Grafika/danceCat.gif";
                textCongratulations = "CUDOWNIE!";
                progress.setMaximum(9);
                break;
            default:
                songToLearn = "V symfonia";
                songCongratulations = "when-mom";
                songToLearnNotes = "GGGDisFFFD";
                gifCongratulations = "/Grafika/kotKrolik.gif";
                textCongratulations = "EKSTRA!";
                progress.setMaximum(8);
                break;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton playSong;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton songChoose;
    private javax.swing.JLabel tryAgain;
    // End of variables declaration//GEN-END:variables
    private Timer timer;
    private Timer timerOff;
}
