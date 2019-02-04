package feb_04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateThread_02 implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum += i;

        }

        System.out.println("Sum from thread 02: " + sum);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CreateThread_02.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
