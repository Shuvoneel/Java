package loop.page_178;

public class TestSum {

    public static void main(String[] args) {
        double CurVal = 0.01;
        double sum =0;

        for (int num = 0; num < 100; num++) {
            sum += CurVal;
            CurVal += 0.01;
        }
        System.out.println("The sum is: " + sum);
    }
}
