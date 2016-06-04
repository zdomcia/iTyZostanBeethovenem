package ityzostanbeethovenem;

import java.awt.Color;

public class InstrumentChooser extends javax.swing.JDialog {

    private String path;

    public InstrumentChooser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instrument = new javax.swing.JComboBox<>();
        confirm = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(330, 250));
        setMinimumSize(new java.awt.Dimension(330, 250));
        setPreferredSize(new java.awt.Dimension(330, 250));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        instrument.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        instrument.setForeground(new java.awt.Color(73, 73, 79));
        instrument.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pianino", "Saksofon", "Gitara" }));
        instrument.setFocusable(false);
        instrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentActionPerformed(evt);
            }
        });
        getContentPane().add(instrument);
        instrument.setBounds(120, 70, 100, 40);

        confirm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(73, 73, 79));
        confirm.setText("OK");
        confirm.setFocusable(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm);
        confirm.setBounds(130, 120, 70, 42);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafika/ptak.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 320, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        switch ((String) instrument.getSelectedItem()) {
            case "Gitara":
                path = "gitara\\";
                break;
            case "Saksofon":
                path = "saksofon\\";
                break;
            default:
                path = "piano\\";
                break;
        }
        setVisible(false);
        dispose();
    }//GEN-LAST:event_confirmActionPerformed

    private void instrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrumentActionPerformed

    public String showDialog() {
        setVisible(true);
        return path;
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
            java.util.logging.Logger.getLogger(InstrumentChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstrumentChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstrumentChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstrumentChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InstrumentChooser dialog = new InstrumentChooser(new javax.swing.JFrame(), true);
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
    public static javax.swing.JComboBox<String> instrument;
    // End of variables declaration//GEN-END:variables
}
