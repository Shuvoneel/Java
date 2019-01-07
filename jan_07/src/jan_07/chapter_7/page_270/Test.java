package jan_07.chapter_7.page_270;

public class Test {

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, 4.5};
        for (double x : SelectionSort.selectionSort(list)) {
            System.out.print(x + ", ");
        }
    }
}