package jan_19.chapter_19.generic.page_746;

public class MaxGeneric {

    public static void main(String[] args) {
        System.out.println(MaxGeneric.max(29, 18));
    }

    public static <E extends Comparable<E>> E max(E o1, E o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
