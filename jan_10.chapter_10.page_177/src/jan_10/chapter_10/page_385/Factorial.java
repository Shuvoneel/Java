package jan_10.chapter_10.page_385;

import java.math.BigInteger;

public class Factorial {
    
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(5));
    }
    
    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
