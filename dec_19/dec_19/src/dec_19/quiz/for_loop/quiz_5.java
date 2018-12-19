package dec_19.quiz.for_loop;
// Print 1 to 20 but stop when it reaches at half position
public class quiz_5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                break;
            } else {
                System.out.println("Number: " + i);
            }
        }
    }
}
