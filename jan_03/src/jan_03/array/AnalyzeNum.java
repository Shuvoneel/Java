package jan_03.array;

import java.util.Scanner;

public class AnalyzeNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        double[] num = new double[n];
        double sum = 0;

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < n; i++) {
            num[i] = input.nextDouble();
            sum += num[i];
        }
        double avg = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] > avg) {
                System.out.println("Average is " + avg);
                count++;
            }
        }
        System.out.println("Number of elements above the average is " + count);
    }
}
