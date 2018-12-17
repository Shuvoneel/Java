
package chapter.two.datatype;

public class DatatypeVariable {

    //Primitive data types
    static byte byteVar = 127; // 8 bits
    static short shortVar = 32767; // 16 bits
    static int intVar = 2147483647; // 32 bits
    static long longVar = 2147483648L; // 64 bits
    static float floatVar = 2147483647.7F; // 32 bits
    static double doubleVar = 2147483648.0; // 64 bits
    static char carVar = 'A';
    static boolean booleanVar = true;

    //Referenc data types
    static String name = "Shuvo";

    public static void main(String[] args) {

        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("carVar: " + carVar);
        System.out.println("booleanVar: " + booleanVar);

        System.out.println("name: " + name);

        int num = 10;
        num++;
        num--;
        num += 50;
        --num;
        num -= 10;
        System.out.println("num: " + num);
    }

}
