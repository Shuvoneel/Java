package dec_19.quiz.for_loop;
// Print odd & even number from 1 to 20
public class quiz_3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0){
                System.out.println("Even: " + i);
            }else{
                System.out.println("Odd: " + i);
            }
            
        }
    }
}
