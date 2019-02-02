package last_practice.home;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        printFactorial();
    }

    public static void printFactorial() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int factorial = 1;
        for (int i = a; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
