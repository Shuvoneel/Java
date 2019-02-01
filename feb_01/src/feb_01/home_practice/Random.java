package feb_01.home_practice;

public class Random {

    public static void main(String[] args) {
        randomNumber();
    }

    public static void randomNumber() {
        for (int i = 1; i <= 10; i++) {
            int x = (int) (Math.random() * 10) + 1;
            System.out.println(x);
        }
    }
}
