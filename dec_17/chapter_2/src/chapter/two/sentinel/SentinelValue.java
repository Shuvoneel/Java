package chapter.two.sentinel;

import java.util.Scanner;

public class SentinelValue {

    static int n;
    static int sum;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while (n != 7) {
            System.out.println("Enter number:");
            n = sn.nextInt();
            if (n != 7) {
                sum += n;
            }
        }
        System.out.println("Sum until enter 7 : " + sum);
    }
}
