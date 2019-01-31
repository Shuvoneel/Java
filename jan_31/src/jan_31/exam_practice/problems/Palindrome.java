package jan_31.exam_practice.problems;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("saas"));
    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = false;

        if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
