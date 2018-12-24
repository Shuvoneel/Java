package dec_24.chapter_6.method_practice;

import java.util.Scanner;

public class Combine {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        String sign = input.next();
        System.out.println(combineAll(n1, n2, sign));
    }
    
    public static int combineAll(int n1, int n2, String sign) {
        int rs = 0;
        if (sign.equals("+")) {
            rs = addNum(n1, n2);
        } else if (sign.equals("*")) {
            rs = multiplyNum(n1, n2);
        } else if (sign.equals("-")) {
            rs = subNum(n1, n2);
        } else if (sign.equals("/")) {
            rs = divideNum(n1, n2);
        } else {
            rs = modNum(n1, n2);
        }
        return rs;
        
    }
    
    public static int addNum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    
    public static int multiplyNum(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }
    
    public static int divideNum(int n1, int n2) {
        int result = n1 / n2;
        return result;
    }
    
    public static int subNum(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
    
    public static int modNum(int n1, int n2) {
        int result = n1 % n2;
        return result;
    }
}
