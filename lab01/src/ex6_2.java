import java.util.Scanner;
public class ex6_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name:");
        String strname = sc.nextLine();
        System.out.println("How old are you:");
        int age = sc.nextInt();
        System.out.println("How tall are you:");
        double height = sc.nextDouble();
        System.out.println("Mrs/Ms "+strname+","+age+" years old,"+"Your height is "+height+"m.");
    }
}
