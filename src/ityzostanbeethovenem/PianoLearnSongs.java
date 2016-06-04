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
        //progressCount = 0;
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

        playSong.setBackground(new Color(0,0,0,0));
        playSong.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        playSong.setForeground(new java.awt.Color(76, 76, 76));
        playSong.setText("Naucz");
        playSong.setActionCommand("naucz");
        playSong.setFocusable(false);
        playSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playSongActionPerformed(evt);
            }
        });
        getContentPane().add(playSong);
        playSong.setBounds(150, 440, 340, 80);
        getContentPane().add(progress);
        progress.setBounds(150, 370, 340, 50);

        songChoose.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        songChoose.setForeground(new java.awt.Color(76, 76, 76));
        songChoose.setText("Wybierz piosenkę");
        songChoose.setFocusable(false);
        songChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songChooseActionPerformed(evt);
            }
        });
        getContentPane().add(songChoose);
        songChoose.setBounds(150, 530, 340, 80);

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

            openCongratulations(songCongratulations, gifCongratulations, textCongratulations);
        } else if (!sequence.equals(songToLearnNotes.substring(0, sequence.length()))) {
            sequence = "";
            progress.setValue(0);
            Player playerWrong = new Player();
            playerWrong.path = "wrong";
            playerWrong.play("");
            
            //tryAgain.setVisible(true);
            showLabel();
        }
    }

        private void showLabel() {
        
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.schedule(new Runnable() {
            public void run() {
                tryAgain.setVisible(false);
                //congratulations.dispose();
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

        if ("Oda do radości".equals(song)) {
            songToLearn = "Oda do radości";
            //songToLearnNotes = "EEFGGFEDCCDEEDD";
            songToLearnNotes = "EEF";
            songCongratulations = "cat";
            gifCongratulations = "/Grafika/pizza.gif";
            textCongratulations = "SUPER!";
            //progress.setMaximum(15);
            progress.setMaximum(3);
        } else {
            songToLearn = "Sto lat";
            songCongratulations = "when-mom";
            //songToLearnNotes = "GEGEGAGFEF";
            songToLearnNotes = "GEGE";
            gifCongratulations = "/Grafika/kotKrolik.gif";
            textCongratulations = "EKSTRA!";
            //progress.setMaximum(10);
            progress.setMaximum(4);
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
