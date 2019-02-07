package feb_03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinMethod extends Thread {

    public static void main(String[] args) {
        Thread a = new JoinMethod();
        Thread b = new JoinMethod();
        a.start();
        try {
            a.join(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        b.start();
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
