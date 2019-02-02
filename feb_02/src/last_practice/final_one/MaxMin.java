package last_practice.final_one;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        maxMinNum();
    }

    public static void maxMinNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length");
        int length = input.nextInt();
        int[] a = new int[length];
        int max = 0;
        int min = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("enter value");
            a[i] = input.nextInt();
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
