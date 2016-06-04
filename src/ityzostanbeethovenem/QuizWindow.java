
package ityzostanbeethovenem;

public abstract class QuizWindow extends javax.swing.JFrame {
    protected javax.swing.JLabel background;
    protected javax.swing.JButton exit;
    protected javax.swing.JButton menu;
     
    public void menuActionPerformed(java.awt.event.ActionEvent evt){
        Menu q = new Menu();
        q.setVisible(true);
        dispose();
    }
    abstract void exitActionPerformed(java.awt.event.ActionEvent evt);
    abstract void close();
}
