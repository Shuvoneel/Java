package jan_31.exam_practice;

import java.util.Arrays;

public class TwoDArraySor {

    public static void main(String[] args) {
        arraySorting();
    }

    public static void arraySorting() {
        int[][] arr = {
            {7, 18, 29, 81},
            {29, 18, 47, 5},
            {3, 29, 18, 77}
        };
        
        for (int[] oneD : arr) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
