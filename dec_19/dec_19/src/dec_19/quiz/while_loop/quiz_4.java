package dec_19.quiz.while_loop;

public class quiz_4 {

    static int i = 1;

    public static void main(String[] args) {
        while (i <= 20) {
            if (i % 5 == 0) {
                System.out.println("Divisible by 5: " + i);
            }
            i++;
        }
    }
}
