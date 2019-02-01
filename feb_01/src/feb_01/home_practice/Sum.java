package feb_01.home_practice;

public class Sum {

    public static void main(String[] args) {
        makeSum();
        oddSum();
        evenSum();
    }

    public static void makeSum() {
        int n = 0;
        int sum = 0;
        while (n <= 10) {
            sum += n;
            n++;
        }
        System.out.println("Sum: " + sum);
    }

    public static void oddSum() {
        int a = 0;
        int sum1 = 0;
        while (a <= 10) {
            if (a % 2 == 1) {
                sum1 += a;
            }
            a++;
        }
        System.out.println("OddSum: " + sum1);
    }

    public static void evenSum() {
        int b = 0;
        int sum2 = 0;
        while (b <= 10) {
            if (b % 2 == 0) {
                sum2 += b;
            }
            b++;
        }
        System.out.println("OddSum: " + sum2);
    }
}
