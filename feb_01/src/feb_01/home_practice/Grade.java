package feb_01.home_practice;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        passFail();
    }

    public static void passFail() {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter your obtained number");
        int i = input.nextInt();

        switch ((i / 10) * 10) {
            case 90:
                System.out.println("Grade A");
                break;
            case 80:
                System.out.println("Grade B");
                break;
            case 70:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail !");
        }
    }
}
