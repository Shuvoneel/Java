package last_practice.final_one;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        findFact();
    }

    public static void findFact() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter factorial number");
        int n = input.nextInt();
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
