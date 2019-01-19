package jan_19.chapter_19.generic.page_744;

public class GenericSort {

    public static void main(String[] args) {
        Integer[] intArray = {2, new Integer(4), new Integer(3)};

        Double[] doubleArray = {3.4, 1.3, -22.1};

        Character[] charArray = {'a', 's', 'j', 'r', 'm'};

        String[] stringArray = {"Tom", "Jerry", "Kim", "Shuvo"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted Integer objects: ");
        printList(intArray);

        System.out.println("Sorted Double objects: ");
        printList(doubleArray);

        System.out.println("Sorted Character objects: ");
        printList(charArray);

        System.out.println("Sorted String objects: ");
        printList(stringArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }

    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }
}
