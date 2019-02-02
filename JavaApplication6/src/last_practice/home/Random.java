package last_practice.home;

public class Random {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int n = (int) (Math.random() * 10 + 1);
            System.out.println(n);
        }
    }
}
