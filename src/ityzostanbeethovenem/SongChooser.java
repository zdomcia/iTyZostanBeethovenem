package ityzostanbeethovenem;

public class SongChooser extends javax.swing.JDialog {

    private String piosenka;

    public SongChooser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        songs = new javax.swing.JComboBox<>();
        confirm = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(330, 250));
        setMinimumSize(new java.awt.Dimension(330, 250));
        setPreferredSize(new java.awt.Dimension(330, 250));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        songs.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        songs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sto lat", "Oda do radości" }));
        songs.setFocusable(false);
        getContentPane().add(songs);
        songs.setBounds(80, 80, 170, 40);

        confirm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        confirm.setText("OK");
        confirm.setFocusable(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm);
        confirm.setBounds(130, 130, 63, 42);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/ptak1.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 320, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        piosenka = (String) songs.getSelectedItem();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_confirmActionPerformed

    public String showDialog() {
        setVisible(true);
        return piosenka;
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
            java.util.logging.Logger.getLogger(SongChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SongChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SongChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SongChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SongChooser dialog = new SongChooser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton confirm;
    public static javax.swing.JComboBox<String> songs;
    // End of variables declaration//GEN-END:variables
}
