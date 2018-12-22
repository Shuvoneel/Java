package dec_22.page143;

import java.util.Scanner;

public class HexaDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexStr = input.nextLine();

        if (hexStr.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(0);
        }

        char s = hexStr.charAt(0);
        if (s <= 'F' && s >= 'A') {
            int value = s - 'A' + 10;
            System.out.println("The decimal value for hex digit " + s + " is " + value);
        } else if (Character.isDigit(s)) {
            System.out.println("The decimal value for hex digit " + s + " is " + s);
        } else {
            System.out.println(s + "is an invalid input");
        }
    }
}
