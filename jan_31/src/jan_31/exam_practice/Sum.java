package jan_31.exam_practice;

public class Sum {

    public static void main(String[] args) {
        makeSum(1, 10);
        oddSum(1, 10);
        evenSum(1, 10);
    }

    public static void makeSum(int n1, int n2) {
        int sum = 0;
        while (n1 <= n2) {
            sum += n1;
            n1++;
        }
        System.out.println("Sum from 1-10: " + sum);
    }

    public static void oddSum(int a1, int a2) {
        int sum1 = 0;
        while (a1 <= a2) {
            if (a1 % 2 != 0) {
                sum1 += a1;
            }
            a1++;
        }
        System.out.println("Sum of odd numbers from 1-10: " + sum1);
    }

    public static void evenSum(int b1, int b2) {
        int sum2 = 0;
        while (b1 <= b2) {
            if (b1 % 2 == 0) {
                sum2 += b1;
            }
            b1++;
        }
        System.out.println("Sum of even numbers from 1-10: " + sum2);
    }
}
