package ityzostanbeethovenem;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class Piano extends javax.swing.JFrame {

    protected Player player;
    protected String sequence;
    protected int progressCount;

    public Piano() {
        player = new Player();
        sequence = "";
        progressCount = 0;
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        addKeyboard();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JButton();
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
        instrumentChoose = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Fis1 = new javax.swing.JButton();
        Gis1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        Cis2 = new javax.swing.JButton();
        Dis2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(810, 450));
        getContentPane().setLayout(null);

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
        menu.setBounds(1240, 660, 50, 50);

        Cis.setBackground(java.awt.Color.darkGray);
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

        Dis.setBackground(java.awt.Color.darkGray);
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

        Fis.setBackground(java.awt.Color.darkGray);
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

        Gis.setBackground(java.awt.Color.darkGray);
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

        B.setBackground(java.awt.Color.darkGray);
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

        Cis1.setBackground(java.awt.Color.darkGray);
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

        Dis1.setBackground(java.awt.Color.darkGray);
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

        C.setBackground(new java.awt.Color(245, 245, 245));
        C.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        C.setFocusable(false);
        C.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C);
        C.setBounds(127, 77, 58, 275);

        D1.setBackground(new java.awt.Color(245, 245, 245));
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
        D1.setBounds(567, 77, 58, 275);

        C1.setBackground(new java.awt.Color(245, 245, 245));
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
        C1.setBounds(512, 77, 58, 275);

        H.setBackground(new java.awt.Color(245, 245, 245));
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

        A.setBackground(new java.awt.Color(245, 245, 245));
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
        A.setBounds(402, 77, 58, 275);

        G.setBackground(new java.awt.Color(245, 245, 245));
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
        G.setBounds(347, 77, 58, 275);

        D.setBackground(new java.awt.Color(245, 245, 245));
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
        D.setBounds(182, 77, 58, 275);

        F.setBackground(new java.awt.Color(245, 245, 245));
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
        F.setBounds(292, 77, 58, 275);

        E.setBackground(new java.awt.Color(245, 245, 245));
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
        E.setBounds(237, 77, 58, 275);

        E1.setBackground(new java.awt.Color(245, 245, 245));
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
        E1.setBounds(622, 77, 58, 275);

        instrumentChoose.setBackground(new Color(0,0,0,0));
        instrumentChoose.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        instrumentChoose.setForeground(new java.awt.Color(76, 76, 76));
        instrumentChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/options.png"))); // NOI18N
        instrumentChoose.setFocusable(false);
        instrumentChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentChooseActionPerformed(evt);
            }
        });
        getContentPane().add(instrumentChoose);
        instrumentChoose.setBounds(1185, 661, 50, 50);

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
        exit.setBounds(1298, 666, 50, 40);

        Fis1.setBackground(java.awt.Color.darkGray);
        Fis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fis1.setForeground(new java.awt.Color(255, 255, 255));
        Fis1.setToolTipText("");
        Fis1.setBorder(null);
        Fis1.setFocusable(false);
        Fis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Fis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fis1ActionPerformed(evt);
            }
        });
        getContentPane().add(Fis1);
        Fis1.setBounds(710, 76, 32, 170);

        Gis1.setBackground(java.awt.Color.darkGray);
        Gis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Gis1.setForeground(new java.awt.Color(255, 255, 255));
        Gis1.setToolTipText("");
        Gis1.setBorder(null);
        Gis1.setFocusable(false);
        Gis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Gis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gis1ActionPerformed(evt);
            }
        });
        getContentPane().add(Gis1);
        Gis1.setBounds(770, 76, 32, 170);

        B1.setBackground(java.awt.Color.darkGray);
        B1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setToolTipText("");
        B1.setBorder(null);
        B1.setFocusable(false);
        B1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(830, 76, 32, 170);

        F1.setBackground(new java.awt.Color(245, 245, 245));
        F1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        F1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        F1.setFocusable(false);
        F1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        getContentPane().add(F1);
        F1.setBounds(677, 77, 58, 275);

        G1.setBackground(new java.awt.Color(245, 245, 245));
        G1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        G1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        G1.setFocusable(false);
        G1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        getContentPane().add(G1);
        G1.setBounds(732, 77, 58, 275);

        A1.setBackground(new java.awt.Color(245, 245, 245));
        A1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        A1.setFocusable(false);
        A1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1);
        A1.setBounds(787, 77, 58, 275);

        H1.setBackground(new java.awt.Color(245, 245, 245));
        H1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        H1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        H1.setFocusable(false);
        H1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });
        getContentPane().add(H1);
        H1.setBounds(842, 77, 58, 275);

        Cis2.setBackground(java.awt.Color.darkGray);
        Cis2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cis2.setForeground(new java.awt.Color(255, 255, 255));
        Cis2.setToolTipText("");
        Cis2.setBorder(null);
        Cis2.setFocusable(false);
        Cis2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cis2ActionPerformed(evt);
            }
        });
        getContentPane().add(Cis2);
        Cis2.setBounds(940, 77, 32, 170);

        Dis2.setBackground(java.awt.Color.darkGray);
        Dis2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Dis2.setForeground(new java.awt.Color(255, 255, 255));
        Dis2.setToolTipText("");
        Dis2.setBorder(null);
        Dis2.setFocusable(false);
        Dis2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Dis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dis2ActionPerformed(evt);
            }
        });
        getContentPane().add(Dis2);
        Dis2.setBounds(998, 77, 32, 170);

        D2.setBackground(new java.awt.Color(245, 245, 245));
        D2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        D2.setToolTipText("");
        D2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        D2.setBorderPainted(false);
        D2.setFocusable(false);
        D2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        getContentPane().add(D2);
        D2.setBounds(952, 77, 58, 275);

        C2.setBackground(new java.awt.Color(245, 245, 245));
        C2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        C2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        C2.setFocusable(false);
        C2.setMaximumSize(new java.awt.Dimension(49, 49));
        C2.setMinimumSize(new java.awt.Dimension(49, 49));
        C2.setPreferredSize(new java.awt.Dimension(49, 49));
        C2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2);
        C2.setBounds(897, 77, 58, 275);

        E2.setBackground(new java.awt.Color(245, 245, 245));
        E2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        E2.setToolTipText("");
        E2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216), new java.awt.Color(216, 213, 216)));
        E2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        E2.setFocusable(false);
        E2.setOpaque(false);
        E2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });
        getContentPane().add(E2);
        E2.setBounds(1007, 77, 58, 275);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        pianoPressed("D1");
    }//GEN-LAST:event_D1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        pianoPressed("C1");
    }//GEN-LAST:event_C1ActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        pianoPressed("H");
    }//GEN-LAST:event_HActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        pianoPressed("A");
    }//GEN-LAST:event_AActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        pianoPressed("G");
    }//GEN-LAST:event_GActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        pianoPressed("D");
    }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        pianoPressed("F");
    }//GEN-LAST:event_FActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        pianoPressed("C");
    }//GEN-LAST:event_CActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        pianoPressed("E");
    }//GEN-LAST:event_EActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        pianoPressed("E1");
    }//GEN-LAST:event_E1ActionPerformed

    private void CisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CisActionPerformed
        pianoPressed("Cis");
    }//GEN-LAST:event_CisActionPerformed

    private void DisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisActionPerformed
        pianoPressed("Dis");
    }//GEN-LAST:event_DisActionPerformed

    private void Cis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cis1ActionPerformed
        pianoPressed("Cis1");
    }//GEN-LAST:event_Cis1ActionPerformed

    private void Dis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dis1ActionPerformed
        pianoPressed("Dis1");
    }//GEN-LAST:event_Dis1ActionPerformed

    private void FisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FisActionPerformed
        pianoPressed("Fis");
    }//GEN-LAST:event_FisActionPerformed

    private void GisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GisActionPerformed
        pianoPressed("Gis");
    }//GEN-LAST:event_GisActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        pianoPressed("B");
    }//GEN-LAST:event_BActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuActionPerformed

    protected void addKeyboard() {
        String[] keyboardLetters = {"A", "S", "D", "F", "G", "H", "J", "K", "L", "SEMICOLON", "1", "2", "3", "4", "5", "6", "7", "W", "E", "T", "Y", "U", "O", "P", "F2", "F3", "F4", "F5", "F6"};
        String[] keyboard = {"C", "D", "E", "F", "G", "A", "H", "C1", "D1", "E1", "F1", "G1", "A1", "H1", "C2", "D2", "E2", "Cis", "Dis", "Fis", "Gis", "B", "Cis1", "Dis1", "Fis1", "Gis1", "B1", "Cis2", "Dis2"};
        javax.swing.JButton[] buttons = {C, D, E, F, G, A, H, C1, D1, E1, F1, G1, A1, H1, C2, D2, E2, Cis, Dis, Fis, Gis, B, Cis1, Dis1, Fis1, Gis1, B1, Cis2, Dis2};
        for (int i = 0; i < keyboard.length; ++i) {
            this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke(keyboardLetters[i]), keyboard[i]);
            this.getRootPane().getInputMap().put(KeyStroke.getKeyStroke("released " + keyboardLetters[i]), "released" + keyboard[i]);
            this.getRootPane().getActionMap().put(keyboard[i], new PressedKey(keyboard[i], buttons[i]));
            this.getRootPane().getActionMap().put("released" + keyboard[i], new ReleasedKey(buttons[i]));
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
            sequence += note;
            progressCount++;
            player.play(note);
        }
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
            check();
        }
    }

    private void instrumentChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentChooseActionPerformed
        InstrumentChooser instrumentChoosingWindow = new InstrumentChooser(this, true);
        String path = instrumentChoosingWindow.showDialog();
        if (path != null) {
            player.path = path;
        }
    }//GEN-LAST:event_instrumentChooseActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_exitActionPerformed

    private void Fis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fis1ActionPerformed
        pianoPressed("Fis1");
    }//GEN-LAST:event_Fis1ActionPerformed

    private void Gis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gis1ActionPerformed
        pianoPressed("Gis1");
    }//GEN-LAST:event_Gis1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        pianoPressed("B1");
    }//GEN-LAST:event_B1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        pianoPressed("F1");
    }//GEN-LAST:event_F1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        pianoPressed("G1");
    }//GEN-LAST:event_G1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        pianoPressed("A1");
    }//GEN-LAST:event_A1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        pianoPressed("H1");
    }//GEN-LAST:event_H1ActionPerformed

    private void Cis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cis2ActionPerformed
        pianoPressed("Cis2");
    }//GEN-LAST:event_Cis2ActionPerformed

    private void Dis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dis2ActionPerformed
        pianoPressed("Dis2");
    }//GEN-LAST:event_Dis2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        pianoPressed("D2");
    }//GEN-LAST:event_D2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        pianoPressed("C2");
    }//GEN-LAST:event_C2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        pianoPressed("E2");
    }//GEN-LAST:event_E2ActionPerformed

    protected void pianoPressed(String note) {
        player.play(note);
    }

    protected void check() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton A;
    protected javax.swing.JButton A1;
    protected javax.swing.JButton B;
    protected javax.swing.JButton B1;
    protected javax.swing.JButton C;
    protected javax.swing.JButton C1;
    protected javax.swing.JButton C2;
    protected javax.swing.JButton Cis;
    protected javax.swing.JButton Cis1;
    protected javax.swing.JButton Cis2;
    protected javax.swing.JButton D;
    protected javax.swing.JButton D1;
    protected javax.swing.JButton D2;
    protected javax.swing.JButton Dis;
    protected javax.swing.JButton Dis1;
    protected javax.swing.JButton Dis2;
    protected javax.swing.JButton E;
    protected javax.swing.JButton E1;
    protected javax.swing.JButton E2;
    protected javax.swing.JButton F;
    protected javax.swing.JButton F1;
    protected javax.swing.JButton Fis;
    protected javax.swing.JButton Fis1;
    protected javax.swing.JButton G;
    protected javax.swing.JButton G1;
    protected javax.swing.JButton Gis;
    protected javax.swing.JButton Gis1;
    protected javax.swing.JButton H;
    protected javax.swing.JButton H1;
    private javax.swing.JButton exit;
    private javax.swing.JButton instrumentChoose;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
