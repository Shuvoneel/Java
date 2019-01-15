package jan_10.chapter_10.page_385;

import java.util.Scanner;

public class Palindrom {

    static String[] s = {"Hello", "mom", "madam"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = input.nextLine();

        System.out.println("is " + word + " Palindrome ? " + isPalindrome(word));
        System.out.println("Number of Palindrome words in variable s is: " + countPalindrome(s));
    }

    public static boolean isPalindrome(String word) {
        boolean status = false;
        StringBuilder str = new StringBuilder(word);
        String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(word)) {
            status = true;
        }
        return status;
    }

    public static int countPalindrome(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPalindrome(s[i])) {
                counter++;
            }
        }
        return counter;
    }
}
