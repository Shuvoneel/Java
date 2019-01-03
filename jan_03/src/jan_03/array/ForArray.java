package jan_03.array;

public class ForArray {

    public static void main(String[] args) {
        int intArray[] = {5, 10, 15, 20, 25};
        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.println(i + " : " + intArray[i]);
        }

        char[] city = {'D', 'a', 'l', 'a', 's'};
        System.out.println(city);
        System.out.println("Length of City : " + city.length);

        int[] intNum = new int[100];
        for (int j = 0; j < intNum.length; j++) {
            intNum[j] = j;
        }
        System.out.println("Length of intNum :" + intNum.length);

        for (int p = 0; p < intNum.length; p++) {
            if (intNum[p] > 50) {
                System.out.println(p + " : " + intNum[p]);
            }
        }

        // For Each or For In Loop..........................
        for (int k : intNum) {
            System.out.println(" For Each :: " + k);
        }
    }
}