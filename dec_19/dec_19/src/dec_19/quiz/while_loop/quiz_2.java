package dec_19.quiz.while_loop;

public class quiz_2 {

    static int i = 1;

    public static void main(String[] args) {
        while (i <= 20) {
            if (i != 5 && i != 10 && i != 15) {
                System.out.println("While: " + i);
            }
            i++;
        }
    }

}
