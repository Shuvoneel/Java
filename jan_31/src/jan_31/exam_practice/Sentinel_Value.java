package jan_31.exam_practice;

import java.util.Scanner;

public class Sentinel_Value {

    public static void main(String[] args) {
        sentinelValue();
    }
    static int n;
    static int sum;

    public static void sentinelValue() {
        Scanner input = new Scanner(System.in);
        while (n != 1) {
            System.out.println("Enter integer number");
            n = input.nextInt();
            if (n != 1) {
                sum += n;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
