package feb_01.home_practice;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        arraySorting();
    }

    public static void arraySorting() {
        int[][] x = {
            {9, 3, 18},
            {29, 7, 57},
            {81, 90, 76}
        };

        for (int[] oneD : x) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}
