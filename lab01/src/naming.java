import javax.swing.JOptionPane;

public class naming {
    public static void main(String[] args){
        String name =  JOptionPane.showInputDialog("Please enter my name:");
        JOptionPane.showMessageDialog(null,"Hello "+name+"!");
        System.exit(0);
    }
}
