package jan_19.chapter_19.generic.page_746;

public class Max {

    public static void main(String[] args) {
        int o1 = 18;
        int o2 = 29;
        System.out.println(max(o1, o2));

        System.out.println(Max.max(18, 7));
        
        System.out.println(Max.max("Shuvo", 18));
    }

    public static Comparable max(Comparable o1, Comparable o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
