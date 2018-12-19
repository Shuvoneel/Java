package dec_19.quiz.for_loop;
// Print 1 to 20 except 5,10,15
public class quiz_2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i != 5 && i != 10 && i != 15) {
                System.out.println("Number: " + i);
            }
        }
    }
}
