import javax.swing.JOptionPane;
public class ex6_1 { 
    public static void main(String[] args){
        int option =  JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null,"You've chose:"+(option==JOptionPane.YES_NO_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
