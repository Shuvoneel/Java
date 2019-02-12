package feb_07.chapter_23;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("Insertion Soring: 2, 9, 5, 4");
        int[] arr = {2, 9, 5, 4};
        for (int i : insertionSort(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int curElement = list[i];
            System.out.println("Current Element: " + curElement);
            int k;
            for (k = i - 1; k >= 0 && list[k] > curElement; k--) {
                list[k + 1] = list[k];
                System.out.println(k + 1 + " No Index =  " + list[k]);
            }
            list[k + 1] = curElement;
            System.out.println(k + 1 + " No Index = " + curElement);
        }
        return list;
    }
}
