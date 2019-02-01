package feb_01.home_practice;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciSeries();
    }

    public static void fibonacciSeries() {
        int a = 0;
        int b = 1;
        for (int c = 0; c < 100; a = b, b = c, c = a + b) {
            System.out.println(c);
        }
    }
}
