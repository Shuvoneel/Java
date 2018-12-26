package loop;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        While_Loop.printNum(1, 10);

        System.out.println("Sum 1 to 10: " + While_Loop.printSum(1, 10));

        System.out.println("Sentinel Value:");
        Scanner input = new Scanner(System.in);
        While_Loop.sentinelVal(input);
        
        For_Loop.printNumFor(1, 10);
    }
}
