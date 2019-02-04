package feb_05.ex_02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example_two implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            System.out.println("I am " + i++);
            if (i == 20) {
                break;
            }
            try {
            
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Example_two.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
