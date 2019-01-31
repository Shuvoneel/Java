package jan_31.exam_practice.problems;


public class Fibonacci {
    
    public static void main(String[] args) {
        fibonacciSeries();
    }

    public static void fibonacciSeries() {
        int a = 0;
        int b = 1;
        for (int c = 0; c <= 100; a = b, b = c, c = a + b) {
            System.out.println(c);
        }
    }
}
