package last_practice.home;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        validateEmail();
    }

    public static void validateEmail() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int atpos = s.indexOf("@");
        int dotpos = s.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Invalid email");
        }
    }
}
