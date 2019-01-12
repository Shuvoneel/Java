package jan_12.chapter_11.inheritence;

public class TestOne {

    public static void main(String[] args) {
        BasicTwo b1 = new BasicTwo(); //b1 is obj & reference is BasicTwo class
        BasicOne b2 = new BasicTwo(); //b2 is obj & reference is BasicOne class
        BasicOne a1 = new BasicOne(); //a1 is obj & reference is BasicOne class
        BasicThree c1 = new BasicThree(); //c1 is obj & reference is BasicThree class
        BasicTwo c2 = new BasicThree(); //c2 is obj & reference is BasicTwo class
        BasicOne c3 = new BasicThree(); //c3 is obj & reference is BasicOne class

        // BasicOne cann't be instance of BasicTwo & BasicThree
        // BasicTwo cann't be instance of BasicThree
        
        System.out.println("a1 instance of:");
        System.out.println(a1 instanceof BasicOne);
        System.out.println(a1 instanceof BasicTwo);
        System.out.println(a1 instanceof BasicThree);

        System.out.println("b1 instance of:");
        System.out.println(b1 instanceof BasicOne);
        System.out.println(b1 instanceof BasicTwo);
        System.out.println(b1 instanceof BasicThree);

        System.out.println("c1 instance of:");
        System.out.println(c1 instanceof BasicOne);
        System.out.println(c1 instanceof BasicTwo);
        System.out.println(c1 instanceof BasicThree);
    }
}
