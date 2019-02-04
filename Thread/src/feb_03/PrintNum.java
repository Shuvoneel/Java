package feb_03;

public class PrintNum implements Runnable {

    private final int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.println(" " + i);
        }
    }

}
