package last_practice.home;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        passFail();
    }

    public static void passFail() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your obtained number");
        int a = input.nextInt();
        switch ((a / 10) * 10) {
            case 90:
                System.out.println("Grade A+");
                break;
            case 80:
                System.out.println("Grade A");
                break;
            case 70:
                System.out.println("Grade B");
                break;
            default:
                System.out.println("Fail ");
        }
    }
}
