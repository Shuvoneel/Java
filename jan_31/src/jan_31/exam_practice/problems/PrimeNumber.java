package jan_31.exam_practice.problems;

import java.math.BigInteger;

public class PrimeNumber {

    public static void main(String[] args) {
        checkPrime(1, 10);
    }

    public static boolean isPrime(int a) {
        boolean prime = false;

        if (new BigInteger(String.valueOf(a)).isProbablePrime(a)) {
            prime = true;
        }
        return prime;
    }

    public static void checkPrime(int b, int c) {
        while (b < c) {
            if (isPrime(b)) {
                System.out.println(b + " is Prime");
            }
            b++;
        }
    }
}
