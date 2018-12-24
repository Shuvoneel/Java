
package dec_24.chapter_6.method_practice;

public class Modulus {
    public static void main(String[] args) {
        System.out.println(modNum(64, 5));
    }
    public static int modNum(int b1, int b2){
        int result = b1%b2;
        return result;
    }
}