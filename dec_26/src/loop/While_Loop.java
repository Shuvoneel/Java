package loop;

import java.util.Scanner;

public class While_Loop {

    public static void printNum(int num1, int num2) {

        while (num1 <= num2) {
            System.out.println("While Loop: " + num1);
            num1++;
        }
    }

    public static int printSum(int num1, int num2) {
        int sum = 0;
        while (num1 <= num2) {
            sum += num1;
            num1++;
        }
        return sum;
    }

    public static int sentinelVal(Scanner input) {

        int sum = 0;
        int n = 1;
        while (true) {
            System.out.println("Input integer number " + n + " time:");
            int num1 = input.nextInt();
            if (num1 != -1) {
                sum += num1;
                System.out.println("Sum : " + sum);
                n++;
            } else {
                System.out.println("Loop Stopped !!! " + "Sum-Total: " + sum);
                break;
            }
        }
        return sum;
    }
}
