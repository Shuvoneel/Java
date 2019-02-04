package feb_05.ex_01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example_one implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i<=10) {
            System.out.println("I am " + i++);
            if (i == 10) {
                System.out.println("I am " + i);
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Example_one.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
