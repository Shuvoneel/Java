package feb_05.ex_02;

public class Shuvo implements Runnable {
    
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            System.out.println("You are " + i++);
            if (i == 20) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
