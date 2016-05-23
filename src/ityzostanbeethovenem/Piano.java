package ityzostanbeethovenem;

import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import sun.audio.*;
import java.io.*;

import javax.swing.AbstractAction;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class Piano extends javax.swing.JFrame {

    public Piano() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        //setResizable(true);
        addKeyboard();
        

    }

    String piano = "piano\\";
    String saksofon = "saksofon\\";
    String gitara = "gitara\\";
    String path = piano;

    int x = 0;
    boolean on = false;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        Radio3 = new javax.swing.JRadioButton();
        buttonMenu = new javax.swing.JButton();
        Cis = new javax.swing.JButton();
        Dis = new javax.swing.JButton();
        Fis = new javax.swing.JButton();
        Gis = new javax.swing.JButton();
        B = new javax.swing.JButton();
        Cis1 = new javax.swing.JButton();
        Dis1 = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        H = new javax.swing.JButton();
        A = new javax.swing.JButton();
        G = new javax.swing.JButton();
        D = new javax.swing.JButton();
        F = new javax.swing.JButton();
        E = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        songs = new javax.swing.JComboBox<>();
        learn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(810, 450));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        ButtonGroup.add(Radio1);
        Radio1.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Radio1.setForeground(new java.awt.Color(68, 68, 68));
        Radio1.setText("pianino");
        Radio1.setFocusable(false);
        Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio1ActionPerformed(evt);
            }
        });
        getContentPane().add(Radio1);
        Radio1.setBounds(100, 500, 120, 50);

        ButtonGroup.add(Radio2);
        Radio2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Radio2.setForeground(new java.awt.Color(68, 68, 68));
        Radio2.setText("saksofon");
        Radio2.setToolTipText("");
        Radio2.setFocusable(false);
        Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio2ActionPerformed(evt);
            }
        });
        getContentPane().add(Radio2);
        Radio2.setBounds(600, 510, 120, 30);

        ButtonGroup.add(Radio3);
        Radio3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Radio3.setForeground(new java.awt.Color(68, 68, 68));
        Radio3.setText("gitara");
        Radio3.setFocusable(false);
        Radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio3ActionPerformed(evt);
            }
        });
        getContentPane().add(Radio3);
        Radio3.setBounds(350, 510, 110, 30);
        Radio3.getAccessibleContext().setAccessibleDescription("");

        buttonMenu.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(68, 68, 68));
        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMenu);
        buttonMenu.setBounds(900, 490, 200, 70);

        Cis.setBackground(java.awt.Color.black);
        Cis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cis.setForeground(new java.awt.Color(255, 255, 255));
        Cis.setToolTipText(""); // NOI18N
        Cis.setBorder(null);
        Cis.setFocusable(false);
        Cis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CisActionPerformed(evt);
            }
        });
        getContentPane().add(Cis);
        Cis.setBounds(170, 76, 32, 170);

        Dis.setBackground(java.awt.Color.black);
        Dis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Dis.setForeground(new java.awt.Color(255, 255, 255));
        Dis.setToolTipText("");
        Dis.setBorder(null);
        Dis.setFocusable(false);
        Dis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisActionPerformed(evt);
            }
        });
        getContentPane().add(Dis);
        Dis.setBounds(230, 76, 32, 170);

        Fis.setBackground(java.awt.Color.black);
        Fis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fis.setForeground(new java.awt.Color(255, 255, 255));
        Fis.setToolTipText("");
        Fis.setBorder(null);
        Fis.setFocusable(false);
        Fis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Fis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FisActionPerformed(evt);
            }
        });
        getContentPane().add(Fis);
        Fis.setBounds(330, 76, 32, 170);

        Gis.setBackground(java.awt.Color.black);
        Gis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gis.setForeground(new java.awt.Color(255, 255, 255));
        Gis.setToolTipText("");
        Gis.setBorder(null);
        Gis.setFocusable(false);
        Gis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Gis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GisActionPerformed(evt);
            }
        });
        getContentPane().add(Gis);
        Gis.setBounds(390, 76, 32, 170);

        B.setBackground(java.awt.Color.black);
        B.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setToolTipText("");
        B.setBorder(null);
        B.setFocusable(false);
        B.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B);
        B.setBounds(450, 76, 32, 170);

        Cis1.setBackground(java.awt.Color.black);
        Cis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cis1.setForeground(new java.awt.Color(255, 255, 255));
        Cis1.setToolTipText("");
        Cis1.setBorder(null);
        Cis1.setFocusable(false);
        Cis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cis1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cis1);
        Cis1.setBounds(554, 76, 32, 170);

        Dis1.setBackground(java.awt.Color.black);
        Dis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Dis1.setForeground(new java.awt.Color(255, 255, 255));
        Dis1.setToolTipText("");
        Dis1.setBorder(null);
        Dis1.setFocusable(false);
        Dis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Dis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dis1ActionPerformed(evt);
            }
        });
        getContentPane().add(Dis1);
        Dis1.setBounds(610, 76, 32, 170);

        C.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        C.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        C.setFocusable(false);
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C);
        C.setBounds(134, 77, 57, 275);

        D1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D1.setToolTipText("");
        D1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        D1.setBorderPainted(false);
        D1.setFocusable(false);
        D1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        getContentPane().add(D1);
        D1.setBounds(568, 77, 57, 275);

        C1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        C1.setFocusable(false);
        C1.setMaximumSize(new java.awt.Dimension(49, 49));
        C1.setMinimumSize(new java.awt.Dimension(49, 49));
        C1.setPreferredSize(new java.awt.Dimension(49, 49));
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(513, 77, 58, 275);

        H.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        H.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        H.setFocusable(false);
        H.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H);
        H.setBounds(457, 77, 58, 275);

        A.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        A.setFocusable(false);
        A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A);
        A.setBounds(403, 77, 57, 275);

        G.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        G.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        G.setFocusable(false);
        G.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        getContentPane().add(G);
        G.setBounds(349, 77, 57, 275);

        D.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        D.setFocusable(false);
        D.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D);
        D.setBounds(188, 77, 57, 275);

        F.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        F.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        F.setFocusable(false);
        F.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        getContentPane().add(F);
        F.setBounds(296, 77, 57, 275);

        E.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        E.setFocusable(false);
        E.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E);
        E.setBounds(242, 77, 57, 275);

        E1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E1.setToolTipText("");
        E1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        E1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E1.setFocusable(false);
        E1.setOpaque(false);
        E1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        getContentPane().add(E1);
        E1.setBounds(622, 77, 57, 275);

        songs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        songs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sto lat", "Oda do radości" }));
        songs.setFocusable(false);
        getContentPane().add(songs);
        songs.setBounds(900, 100, 200, 40);

        learn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        learn.setText("Zagraj");
        learn.setActionCommand("naucz");
        learn.setFocusable(false);
        learn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnActionPerformed(evt);
            }
        });
        getContentPane().add(learn);
        learn.setBounds(900, 200, 200, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/piano.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 810, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addKeyboard() {
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("A"), "C");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released A"), "releasedC");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("S"), "D");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released S"), "releasedD");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("D"), "E");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released D"), "releasedE");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("F"), "F");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released F"), "releasedF");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("G"), "G");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released G"), "releasedG");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("H"), "A");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released H"), "releasedA");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("J"), "H");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released J"), "releasedH");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("K"), "C1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released K"), "releasedC1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("L"), "D1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released L"), "releasedD1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("SEMICOLON"), "E1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released SEMICOLON"), "releasedE1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("W"), "Cis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released W"), "releasedCis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("E"), "Dis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released E"), "releasedDis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("T"), "Fis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released T"), "releasedFis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("Y"), "Gis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released Y"), "releasedGis");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("U"), "B");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released U"), "releasedB");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("O"), "Cis1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released O"), "releasedCis1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("P"), "Dis1");
        this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released P"), "releasedDis1");

        this.getRootPane().getActionMap().put("C", new PressedKey("C", C));
        this.getRootPane().getActionMap().put("releasedC", new ReleasedKey(C));
        this.getRootPane().getActionMap().put("D", new PressedKey("D", D));
        this.getRootPane().getActionMap().put("releasedD", new ReleasedKey(D));
        this.getRootPane().getActionMap().put("E", new PressedKey("E", E));
        this.getRootPane().getActionMap().put("releasedE", new ReleasedKey(E));
        this.getRootPane().getActionMap().put("F", new PressedKey("F", F));
        this.getRootPane().getActionMap().put("releasedF", new ReleasedKey(F));
        this.getRootPane().getActionMap().put("G", new PressedKey("G", G));
        this.getRootPane().getActionMap().put("releasedG", new ReleasedKey(G));
        this.getRootPane().getActionMap().put("A", new PressedKey("A", A));
        this.getRootPane().getActionMap().put("releasedA", new ReleasedKey(A));
        this.getRootPane().getActionMap().put("H", new PressedKey("H", H));
        this.getRootPane().getActionMap().put("releasedH", new ReleasedKey(H));
        this.getRootPane().getActionMap().put("C1", new PressedKey("C1", C1));
        this.getRootPane().getActionMap().put("releasedC1", new ReleasedKey(C1));
        this.getRootPane().getActionMap().put("D1", new PressedKey("D1", D1));
        this.getRootPane().getActionMap().put("releasedD1", new ReleasedKey(D1));
        this.getRootPane().getActionMap().put("E1", new PressedKey("E1", E1));
        this.getRootPane().getActionMap().put("releasedE1", new ReleasedKey(E1));
        this.getRootPane().getActionMap().put("Cis", new PressedKey("Cis", Cis));
        this.getRootPane().getActionMap().put("releasedCis", new ReleasedKey(Cis));
        this.getRootPane().getActionMap().put("Dis", new PressedKey("Dis", Dis));
        this.getRootPane().getActionMap().put("releasedDis", new ReleasedKey(Dis));
        this.getRootPane().getActionMap().put("Fis", new PressedKey("Fis", Fis));
        this.getRootPane().getActionMap().put("releasedFis", new ReleasedKey(Fis));
        this.getRootPane().getActionMap().put("Gis", new PressedKey("Gis", Gis));
        this.getRootPane().getActionMap().put("releasedGis", new ReleasedKey(Gis));
        this.getRootPane().getActionMap().put("B", new PressedKey("B", B));
        this.getRootPane().getActionMap().put("releasedB", new ReleasedKey(B));
        this.getRootPane().getActionMap().put("Cis1", new PressedKey("Cis1", Cis1));
        this.getRootPane().getActionMap().put("releasedCis1", new ReleasedKey(Cis1));
        this.getRootPane().getActionMap().put("Dis1", new PressedKey("Dis1", Dis1));
        this.getRootPane().getActionMap().put("releasedDis1", new ReleasedKey(Dis1));
    }

    class ReleasedKey extends AbstractAction {

        private javax.swing.JButton button;

        public ReleasedKey(javax.swing.JButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            button.getModel().setArmed(false);
            button.getModel().setPressed(false);
        }
    }

    class PressedKey extends AbstractAction {

        private String note;
        private javax.swing.JButton button;

        public PressedKey(String note, javax.swing.JButton button) {
            this.note = note;
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            button.getModel().setPressed(true);
            button.getModel().setArmed(true);
            Play(note);
        }
    }

    public void Play(String note) {
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File(path + note + ".wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        Play("D1");
    }//GEN-LAST:event_D1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        Play("C1");
    }//GEN-LAST:event_C1ActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        Play("H");
    }//GEN-LAST:event_HActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        Play("A");
    }//GEN-LAST:event_AActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        Play("G");
    }//GEN-LAST:event_GActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        Play("D");
    }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        Play("F");
    }//GEN-LAST:event_FActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        Play("C");
    }//GEN-LAST:event_CActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        Play("E");
    }//GEN-LAST:event_EActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        Play("E1");
    }//GEN-LAST:event_E1ActionPerformed

    private void CisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CisActionPerformed
        Play("Cis");
    }//GEN-LAST:event_CisActionPerformed

    private void DisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisActionPerformed
        Play("Dis");
    }//GEN-LAST:event_DisActionPerformed

    private void Cis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cis1ActionPerformed
        Play("Cis1");
    }//GEN-LAST:event_Cis1ActionPerformed

    private void Dis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dis1ActionPerformed
        Play("Dis1");
    }//GEN-LAST:event_Dis1ActionPerformed

    private void FisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FisActionPerformed
        Play("Fis");
    }//GEN-LAST:event_FisActionPerformed

    private void GisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GisActionPerformed
        Play("Gis");
    }//GEN-LAST:event_GisActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        Play("B");
    }//GEN-LAST:event_BActionPerformed

    private void Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio1ActionPerformed
        path = piano;
    }//GEN-LAST:event_Radio1ActionPerformed

    private void Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio2ActionPerformed
        path = saksofon;
    }//GEN-LAST:event_Radio2ActionPerformed

    private void Radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio3ActionPerformed
        path = gitara;
    }//GEN-LAST:event_Radio3ActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        EkranStartowy q = new EkranStartowy();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void timerPressed(final javax.swing.JButton button, final String note) {
        timer = new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Play(note);
                button.getModel().setArmed(true);
                button.getModel().setPressed(true);
            }
        });

    }

    private void timerReleased(final javax.swing.JButton button) {
        timerOff = new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button.getModel().setArmed(false);
                button.getModel().setPressed(false);
            }
        });
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


    private void learnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnActionPerformed

        String message = (String) songs.getSelectedItem();
        if ("Sto lat".equals(message)) {
            playStoLat();
        }
        if ("Oda do radości".equals(message)) {
            playOda();
        }
    }//GEN-LAST:event_learnActionPerformed

    private void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JButton C;
    private javax.swing.JButton C1;
    private javax.swing.JButton Cis;
    private javax.swing.JButton Cis1;
    private javax.swing.JButton D;
    private javax.swing.JButton D1;
    private javax.swing.JButton Dis;
    private javax.swing.JButton Dis1;
    private javax.swing.JButton E;
    private javax.swing.JButton E1;
    private javax.swing.JButton F;
    private javax.swing.JButton Fis;
    private javax.swing.JButton G;
    private javax.swing.JButton Gis;
    private javax.swing.JButton H;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton learn;
    private javax.swing.JComboBox<String> songs;
    // End of variables declaration//GEN-END:variables
    private Timer timer;
    private Timer timerOff;
}
