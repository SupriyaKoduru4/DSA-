
import java.util.Scanner;

// Loops

public class Question3 {

    public static void main(String[] args) {
        for (int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }
        // print numbers from 1 to n 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int num= 1; num <= n; num++){
            System.out.println(num + "");
            System.out.println("Hello world");
        }

        // While Loop
        /*
        Syntax 
        while (condition) {
             //body
        }
        
        */

        int num = 1;
        while (num <= 5) {
          System.out.println(num);
          num += 1;
        }
    }
}
