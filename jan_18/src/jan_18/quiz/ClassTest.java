package jan_18.quiz;

import java.util.Scanner;

public class ClassTest {

    public static void main(String[] args) {
        makeSum();
    }

    public static void makeSum() {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int num = 0;
        int sum = 0;
        int sub = 0;
        while (x % 2 == 0) {
            System.out.println("Enter number:");
            x = input.nextInt();
            ++num;
            if (x % 2 == 0) {
                sum += x;
            }
        }
        sub += sum - ((num - 1) * 10);

        System.out.println("Sum = " + sum);
        System.out.println("Sum After Subtract = " + sub);
    }
}