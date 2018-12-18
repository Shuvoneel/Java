package excersizes.chapter_1.practice_1_12;

public class Practice_1_12 {

    static double hours = 1.0 + (40.0 / 60) + (35.0 / 3600);
    static double kms = 1.6 * 24;
    static double average = kms / hours;

    public static void main(String[] args) {
        System.out.println(hours);
        System.out.println(kms);
        System.out.println("Average speed is: " + average);
    }

}
