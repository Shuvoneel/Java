package jan_03.array;

public class BasicArray {

    public static void main(String[] args) {
        int[] intArr = new int[2];
        intArr[0] = 10;
        intArr[1] = 15;
        System.out.println("Length: " + intArr.length);
        System.out.println("intArr[0] : " + intArr[0]);
        System.out.println("intArr[1] : " + intArr[1]);

        String str[] = new String[3];
        str[0] = "Shuvo";
        System.out.println("str[0] : " + str[0]);

        // Most appropriate...............................
        int intArray[] = {5, 10, 15, 20, 25};
        System.out.println("Minimum : " + intArray[0]);
        System.out.println("Maximum : " + intArray[intArray.length - 1]);
    }
}
