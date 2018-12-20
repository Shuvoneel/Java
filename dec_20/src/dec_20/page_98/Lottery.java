package dec_20.page_98;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        int lottery = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lucky number in two digits:");
        int guess = input.nextInt();

        int LD1 = lottery / 10;
        int LD2 = lottery % 10;

        int GD1 = guess / 10;
        int GD2 = guess % 10;

        System.out.println("Your Lucky number is: " + lottery);
        if (guess == lottery) {
            System.out.println("Wow, It's an an Exact Match !! You won $10,000");
        } else if (GD2 == LD1 && GD1 == LD2) {
            System.out.println("Match all digits: You won $" + guess * 10);
        } else if (GD1 == LD1 || GD1 == LD2 || GD2 == LD1 || GD2 == LD2) {
            System.out.println("Match one digits: You won $" + guess * 5);
        } else {
            System.out.println("Sorry, No Match: Your penalty is $" + guess * 10);
        }
    }

}
