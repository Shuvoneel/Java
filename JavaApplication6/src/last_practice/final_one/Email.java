package last_practice.final_one;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        valmail();
    }

    public static void valmail() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter email");
        String s = input.nextLine();
        int atpos = s.indexOf("@");
        int dotpos = s.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("email is valid");
        } else {
            System.out.println("invalid email");
        }
    }
}
