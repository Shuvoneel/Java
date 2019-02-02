package last_practice.final_one;

public class Fibonacci {

    public static void main(String[] args) {
        fibSeries();
    }

    public static void fibSeries() {
        int a = 0;
        int b = 1;
        for (int c = 0; c < 100; a = b, b = c, c = a + b) {
            System.out.println(c);
        }
    }
}
