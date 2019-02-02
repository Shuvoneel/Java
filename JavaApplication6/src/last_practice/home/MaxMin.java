package last_practice.home;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        maxMinNum();
    }

    public static void maxMinNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = input.nextInt();
        int[] s = new int[length];
        int max = 0;
        int min = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("enter values");
            s[i] = input.nextInt();

            if (i == 0) {
                max = s[i];
                min = s[i];
            } else if (s[i] > max) {
                max = s[i];
            } else if (s[i] < min) {
                min = s[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
