package feb_01.home_practice;

import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) {
        System.out.println(isPrime(6));
        printPrime(1, 10);
    }

    public static boolean isPrime(int a) {
        boolean prime = false;
        if (new BigInteger(String.valueOf(a)).isProbablePrime(a)) {
            prime = true;
        }
        return prime;
    }

    public static void printPrime(int b, int c) {
        while (b < c) {
            if (isPrime(b)) {
                System.out.println(b + " is prime ");
            }
            b++;
        }
    }
}
