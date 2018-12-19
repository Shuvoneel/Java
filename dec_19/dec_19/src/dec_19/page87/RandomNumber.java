package dec_19.page87;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("What is " + num1 + "-" + num2);
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            if (num1 - num2 == answer) {
                System.out.println("You are Right");
            } else {
                System.out.println("You are Wrong");
                System.out.println("Answer should Be: " + (num1 - num2));
            }
        }
    }
}
