package loop.page_180;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st integer:");
        int n1 = input.nextInt();
        System.out.println("Enter 2cd integer:");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("GCD for " + n1 + " and " + n2 + " is " + gcd);
    }
}