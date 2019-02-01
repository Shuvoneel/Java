package feb_01.home_practice;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("huh"));
    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
