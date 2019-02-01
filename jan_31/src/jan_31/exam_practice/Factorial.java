package jan_31.exam_practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = s.nextInt();
        int factorial = 1;
        for (int i = a; i > 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + a + " is: " + factorial);
    }
}
