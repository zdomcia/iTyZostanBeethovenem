package ityzostanbeethovenem;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

public class Piano extends javax.swing.JFrame {

    protected Player player;
    protected String sequence;

    public Piano() {
        player = new Player();
        sequence = "";
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Grafika/ikonka.png")).getImage());
        setMinimumSize(new java.awt.Dimension(810, 450));
        getContentPane().setLayout(null);

        menu.setBackground(new Color(0,0,0,0));
        menu.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 102, 51));
        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(1260, 680, 90, 40);

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

        instrumentChoose.setBackground(new Color(0,0,0,0));
        instrumentChoose.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        instrumentChoose.setForeground(new java.awt.Color(0, 102, 51));
        instrumentChoose.setText("Instrument");
        instrumentChoose.setFocusable(false);
        instrumentChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentChooseActionPerformed(evt);
            }
        });
        getContentPane().add(instrumentChoose);
        instrumentChoose.setBounds(1070, 680, 150, 40);

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
        EkranStartowy q = new EkranStartowy();
        q.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuActionPerformed

    protected void addKeyboard() {
        String[] keyboardLetters = {"A", "S", "D", "F", "G", "H", "J", "K", "L", "SEMICOLON", "W", "E", "T", "Y", "U", "O", "P"};
        String[] keyboard = {"C", "D", "E", "F", "G", "A", "H", "C1", "D1", "E1", "Cis", "Dis", "Fis", "Gis", "B", "Cis1", "Dis1"};
        javax.swing.JButton[] buttons = {C, D, E, F, G, A, H, C1, D1, E1, Cis, Dis, Fis, Gis, B, Cis1, Dis1};
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

    protected void pianoPressed(String note) {
        player.play(note);
    }

    private void check() {
    }

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton A;
    protected javax.swing.JButton B;
    protected javax.swing.JButton C;
    protected javax.swing.JButton C1;
    protected javax.swing.JButton Cis;
    protected javax.swing.JButton Cis1;
    protected javax.swing.JButton D;
    protected javax.swing.JButton D1;
    protected javax.swing.JButton Dis;
    protected javax.swing.JButton Dis1;
    protected javax.swing.JButton E;
    protected javax.swing.JButton E1;
    protected javax.swing.JButton F;
    protected javax.swing.JButton Fis;
    protected javax.swing.JButton G;
    protected javax.swing.JButton Gis;
    protected javax.swing.JButton H;
    private javax.swing.JButton instrumentChoose;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
