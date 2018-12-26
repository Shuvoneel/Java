package loop.page_184;

public class Break {

    public static void main(String[] args) {
        Break.BreakContinue1();

        Break.BreakContinue2();
    }

    public static void BreakContinue1() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void BreakContinue2() {
        for (int i = 1; i <= 10; i++) {
            if (i == 9) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
