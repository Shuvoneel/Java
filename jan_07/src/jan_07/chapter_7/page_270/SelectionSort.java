package jan_07.chapter_7.page_270;

public class SelectionSort {
    
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, 4.5};
        for (double x : SelectionSort.selectionSort(list)) {
            System.out.print(x + ", ");
        }
    }
    
    public static double[] selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}