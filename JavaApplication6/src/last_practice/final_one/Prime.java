package last_practice.final_one;

import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) {
        printPrime(1, 10);
    }

    public static boolean isPrime(int a) {
        boolean prime = false;
        if (new BigInteger(String.valueOf(a)).isProbablePrime(a)) {
            prime = true;
        }
        return prime;
    }

    public static void printPrime(int a, int b) {
        while (a < b) {
            if (isPrime(a)) {
                System.out.println(a + " is prime");
            } else {
                System.out.println(a + " is not prime");
            }
            a++;
        }
    }
}
