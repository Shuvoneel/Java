package jan_31.exam_practice;

import java.math.BigInteger;

public class Prime_Number {

    public static void main(String[] args) {
        checkPrime(1, 10);
    }

    public static boolean isPrime(int n) {
        boolean prime = false;
        if (new BigInteger(String.valueOf(n)).isProbablePrime(n)) {
            prime = true;
        }
        return prime;
    }

    public static void checkPrime(int n1, int n2) {
        while (n1 < n2) {
            if (isPrime(n1)) {
                System.out.println(n1 + " is Prime");
            }
            n1++;
        }
    }
}
