
package ityzostanbeethovenem;

import java.awt.event.WindowEvent;

public abstract class QuizWindow extends javax.swing.JFrame {
     
    public void menuActionPerformed(java.awt.event.ActionEvent evt){
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }
    abstract void exitActionPerformed(java.awt.event.ActionEvent evt);
    abstract void close();
}
