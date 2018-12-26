package loop.page_186;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalinDrome("Moon"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String s = input.nextLine();

        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }
    }

    public static boolean isPalinDrome(String m) {
        boolean isPalinDrome = false;

        if (m.equalsIgnoreCase(new StringBuilder(m).reverse().toString())) {
            isPalinDrome = true;
        }
        return isPalinDrome;
    }
}