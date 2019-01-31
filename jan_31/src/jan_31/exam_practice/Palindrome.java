package jan_31.exam_practice;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println(isPalinDrome("shuvo"));
    }

    public static boolean isPalinDrome(String m) {
        boolean isPalinDrome = false;

        if (m.equalsIgnoreCase(new StringBuilder(m).reverse().toString())) {
            isPalinDrome = true;
        }
        return isPalinDrome;
    }
}
