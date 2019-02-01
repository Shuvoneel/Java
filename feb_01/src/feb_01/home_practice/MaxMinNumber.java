package feb_01.home_practice;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        maxMinNumber();
    }
    

    public static void maxMinNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = input.nextInt();
        int a[] = new int[length];
        int max = 0;
        int min = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("enter values");
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
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
