package feb_01.home_practice;

import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {
        sentinelValue();
    }
    
    public static void sentinelValue(){
        int n = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        while (n != 1) {
            System.out.println("Enter number without 1");
            n = input.nextInt();
            if (n != 1) {
                sum += n;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
