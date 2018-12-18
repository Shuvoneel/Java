package page52;

public class ShowCurrentTime {

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalhours = totalMinutes / 60;

        long currentHour = totalhours % 24;

        System.out.println("Curent Time is: " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
