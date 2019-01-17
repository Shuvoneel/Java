package jan_17.quiz;

import java.util.Scanner;

public class Sentinel {

    static int x;
    static int sum;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (x != 7) {
            System.out.println("Print number:");
            x = input.nextInt();
            if (x != 7) {
                sum += x;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
