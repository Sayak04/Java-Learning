import java.io.*;
import java.util.*;


public class EndOfFileHackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while(scanner.hasNext()) {
            String input = scanner.nextLine();

            System.out.println(lineNumber + " " + input);
            lineNumber++;
        }
        
    }    
}
