package chapter.two.page38;

import java.util.Scanner;

public class Average {

    static int num1, num2, num3, result;

    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter num1:");
        num1 = av.nextInt();
        System.out.println("Enter num2:");
        num2 = av.nextInt();
        System.out.println("Enter num3:");
        num3 = av.nextInt();
        result = (num1 + num2 + num3) / 3;

        System.out.println("Average: " + result);
    }
}
