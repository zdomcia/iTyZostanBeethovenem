
package ityzostanbeethovenem;

<<<<<<< HEAD
public abstract class QuizWindow extends javax.swing.JFrame {
    protected javax.swing.JLabel background;
    protected javax.swing.JButton exit;
    protected javax.swing.JButton menu;
=======
import java.awt.event.WindowEvent;

public abstract class QuizWindow extends javax.swing.JFrame {
>>>>>>> parent of 26d116d... Revert "dodanie klas do dziedziczenia"
     
    public void menuActionPerformed(java.awt.event.ActionEvent evt){
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }
    abstract void exitActionPerformed(java.awt.event.ActionEvent evt);
    abstract void close();
}
