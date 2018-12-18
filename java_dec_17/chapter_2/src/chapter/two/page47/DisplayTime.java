package chapter.two.page47;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds for minutes:");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Seconds = " + minutes + " minutes " + remainingSeconds + " seconds.");

        System.out.println("Enter minutes for days:");
        int num = input.nextInt();
        int days = num / (24 * 60);
        int hours = (num % (24 * 60)) / 60;
        int minute = (num % (24 * 60)) % 60;;
        System.out.println("Minutes = " + days + " days " + hours + " hours " + minute + " minutes");
    }
}
