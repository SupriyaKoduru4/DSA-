
import java.util.Scanner;

// calculator

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input from user till user does not press X or x

        int ans = 0;
        while (true) { 
            //take the operator as input
            char op = sc.nextInt().trim().charAt(0);
            if(op = '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //imput two numbers
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    ans = num1 + num2;

                }
                if(op == '-'){
                    ans = num1 - num2;

                }
                if(op == '*'){
                    ans = num1 * num2;

                }
                if(op == '/'){
                    ans = num1 / num2;

                }
                if(op == '%'){
                    ans = num1 % num2;

                }
                
            }else if (op == 'X' || op == 'x') {
                break;
            }else {
                System.out.println("Invalid operation!!");
            }
        }
        System.out.println(ans);
    }
}
