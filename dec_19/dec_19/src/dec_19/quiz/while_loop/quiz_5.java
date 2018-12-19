package dec_19.quiz.while_loop;

public class quiz_5 {

    static int i = 1;

    public static void main(String[] args) {
        while (i <= 20) {
            if (i == 10) {
                break;
            } else {
                System.out.println("Number is: " + i);
            }
            i++;
        }
    }
}
