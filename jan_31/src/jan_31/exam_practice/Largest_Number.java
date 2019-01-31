package jan_31.exam_practice;

import java.util.Scanner;

public class Largest_Number {

    public static void main(String[] args) {
        largestNumber(29, 18, 47);
    }

    static int n;

    public static void largestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Largest");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is Largest");
        } else {
            System.out.println("Enter three non-equal numbers");
        }
    }
}
