import javax.swing.JOptionPane;
public class calculate {
    public static void main(String[] args){
        String s1 = JOptionPane.showInputDialog(null,"Please input first number:"); 
        String s2 = JOptionPane.showInputDialog(null,"Please input second number:");
        double sum,diff,pro,quo;
        sum = Double.parseDouble(s1) + Double.parseDouble(s2);
        diff= Double.parseDouble(s1) - Double.parseDouble(s2);
        pro = Double.parseDouble(s1) * Double.parseDouble(s2);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(pro);
        if(Double.parseDouble(s2) != 0)
        {
            quo = Double.parseDouble(s1)/Double.parseDouble(s2);
            System.out.println(quo);
        }   
    }
}
