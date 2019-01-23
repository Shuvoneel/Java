package jan_23.evidences;

import static jan_23.evidences.Factorial.factorial;
import static jan_23.evidences.IsPrime.checkPrime;
import static jan_23.evidences.SentinelValue.sentinel;

public class Test {

    public static void main(String[] args) {
        //Sentinel value..........................................................
        sentinel();

        //Factorial number......................................................
        System.out.println("Factorial of  5 is: " + factorial(5));

        //Prime number between 1 to 10................................
        checkPrime(1, 10);

        //Largest Number...........................................................
        LargeSmallNum.largestNum(18, 29, 77);

        //Smallest number.....................................................
        LargeSmallNum.smallNum(18, 29, 77);

        //Palindrome...............................................................
        System.out.println("Is huh Palindrome: " + Palindrome.isPalinDrome("Huh"));

        //Pass Fail...............................................
        GradeSystem.passFail();

    }
}
