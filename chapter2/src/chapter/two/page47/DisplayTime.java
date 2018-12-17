package chapter.two.page47;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds:");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds = " + minutes + " minutes " + remainingSeconds + " seconds.");

        int hours = input.nextInt();
        System.out.println("Enter an integer for days:");
        int days = hours / 24;
        int minutes1 = hours % 24;
        System.out.println(days + " days = " + hours + " hours " + minutes1 + "minutes1");
    }
}
