import java.util.*;
import java.io.*;

public class LoopsHackerrankII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for(int power = 0; power < n; power++) {
                sum += (Math.pow(2, power) * b);
                System.out.print(sum +" ");
            }
        }
        in.close();
    }
}
