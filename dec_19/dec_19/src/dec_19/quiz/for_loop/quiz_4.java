package dec_19.quiz.for_loop;
// Print 1 to 20 those are divisible by 5
public class quiz_4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println("Divisibl by 5:" + i);
            }
        }
    }

}
