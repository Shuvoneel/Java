package feb_01.home_practice;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        validateMail();
    }

    public static void validateMail() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String a = input.nextLine();
        int atpos = a.indexOf("@");
        int dotpos = a.lastIndexOf(".");

        if (atpos > 1 && (dotpos - atpos) > 4) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Invalid email");
        }
    }
}
