package dec_19.quiz.while_loop;

public class quiz_3 {

    static int i = 1;

    public static void main(String[] args) {
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            i++;
        }
    }
}
