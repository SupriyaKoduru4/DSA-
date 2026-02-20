
import java.util.Scanner;

// Take a input of a salary. if the salary is greather than 10,000 add bonus as 2000 otherwise add bonus as 1000.
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        int bonus;
        if (salary > 10000) {
            bonus = 2000;
        } else {
            bonus = 1000;
        }
        int finalSalary = salary + bonus;
        System.out.println(finalSalary);
        sc.close();
    }
}
