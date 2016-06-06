package ityzostanbeethovenem;

public class Chooser extends javax.swing.JDialog {
    protected String path;
    
    public Chooser (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
    
    public String showDialog() {
        setVisible(true);
        return path;
    }
    
}
