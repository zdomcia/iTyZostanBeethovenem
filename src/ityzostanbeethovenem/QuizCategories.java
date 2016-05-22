package ityzostanbeethovenem;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class QuizCategories extends javax.swing.JFrame {

    public QuizCategories() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonInstrumenty = new javax.swing.JButton();
        buttonKompozytorzy = new javax.swing.JButton();
        buttonNotacja = new javax.swing.JButton();
        buttonRozpoznawanieDzwiekow = new javax.swing.JButton();
        buttonWszystko = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Wybierz kategorię");

        buttonInstrumenty.setText("Instrumenty");
        buttonInstrumenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstrumentyActionPerformed(evt);
            }
        });

        buttonKompozytorzy.setText("Kompozytorzy");
        buttonKompozytorzy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKompozytorzyActionPerformed(evt);
            }
        });

        buttonNotacja.setText("Notacja muzyczna");
        buttonNotacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNotacjaActionPerformed(evt);
            }
        });

        buttonRozpoznawanieDzwiekow.setText("Rozpoznawanie dźwięków");
        buttonRozpoznawanieDzwiekow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRozpoznawanieDzwiekowActionPerformed(evt);
            }
        });

        buttonWszystko.setText("Wszystko");
        buttonWszystko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWszystkoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonInstrumenty, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonKompozytorzy, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRozpoznawanieDzwiekow, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNotacja, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWszystko, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonInstrumenty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonKompozytorzy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNotacja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRozpoznawanieDzwiekow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonWszystko)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInstrumentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstrumentyActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(1);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonInstrumentyActionPerformed

    private void buttonKompozytorzyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKompozytorzyActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(2);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonKompozytorzyActionPerformed

    private void buttonNotacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNotacjaActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(3);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonNotacjaActionPerformed

    private void buttonRozpoznawanieDzwiekowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRozpoznawanieDzwiekowActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytaniaKategorii(4);
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonRozpoznawanieDzwiekowActionPerformed

    private void buttonWszystkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWszystkoActionPerformed
        JavaDB db = new JavaDB();
        db.dodajPytania();
        Question q = new Question();
        q.setVisible(true);
        close();
    }//GEN-LAST:event_buttonWszystkoActionPerformed

    public void close() {
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
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizCategories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInstrumenty;
    private javax.swing.JButton buttonKompozytorzy;
    private javax.swing.JButton buttonNotacja;
    private javax.swing.JButton buttonRozpoznawanieDzwiekow;
    private javax.swing.JButton buttonWszystko;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
