import java.util.Arrays;
import java.util.Scanner;

public class ex6_5 {
    public static void main(String[] args){
     int[] x = {1789,2035,1899,1456,2013};
     Arrays.sort(x);
     int sum = 0;
     for(int a : x){
        sum += a;
     }
     double ave = (double)sum / (double)x.length;
     System.out.println("Sum:"+sum+"\nAverage:"+ave);
    }
}
