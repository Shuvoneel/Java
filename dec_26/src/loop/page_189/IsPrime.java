package loop.page_189;

import java.math.BigInteger;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(7));

        System.out.println(checkPrime(1, 10));
    }

    public static boolean isPrime(int num) {
        boolean prime = false;
        if (new BigInteger(String.valueOf(num)).isProbablePrime(num)) {
            prime = true;
        }
        return prime;
    }

    public static boolean checkPrime(int n1, int n2) {
        while (n1 <= n2) {
            if (isPrime(n1)) {
                System.out.println(isPrime(n1));
            }
            n1++;
        }
        return isPrime(n1);
    }
}
