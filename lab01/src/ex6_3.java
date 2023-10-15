import java.util.Scanner;
public class ex6_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("n=");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
          for(int j=n-i;j>=1;j--){
            System.out.printf(" ");
          }
          for(int k = 1;k<=2*i-1;k++){
            System.out.printf("*");
          }
          System.out.printf("\n");
        }

    }
}
