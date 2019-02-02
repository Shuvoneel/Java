package last_practice.final_one;

import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {
        sentinelValue();
    }

    public static void sentinelValue() {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        while (n != 1) {
            System.out.println("enter number");
            n = input.nextInt();
            if (n != 1) {
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
