package last_practice.home;

import java.util.*;

public class Array_Sorting {

    public static void main(String[] args) {
        twoDSorting();
        oneDSorting();
    }

    static public void twoDSorting() {
        int[][] s = {
            {5, 9, 4},
            {7, 3, 2},
            {6, 1, 8}
        };

        for (int[] oneD : s) {
            Arrays.sort(oneD);

            for (int i : oneD) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }

    static public void oneDSorting() {
        int s[] = {5, 1, 7, 4, 29, 18};
        Arrays.sort(s);

        for (int i : s) {
            System.out.println(i + " ");
        }
    }
}
