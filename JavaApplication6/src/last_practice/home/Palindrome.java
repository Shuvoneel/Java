package last_practice.home;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
