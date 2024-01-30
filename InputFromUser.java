import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.out.println("Enter a number:- ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(num);

        System.out.println("Enter a name:- ");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        System.out.println(name);

        sc.close();

        br.close();
    }
}
