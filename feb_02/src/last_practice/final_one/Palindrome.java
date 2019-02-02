package last_practice.final_one;

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
