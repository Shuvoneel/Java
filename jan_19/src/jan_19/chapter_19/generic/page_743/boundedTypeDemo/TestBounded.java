package jan_19.chapter_19.generic.page_743.boundedTypeDemo;

public class TestBounded {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 2);
        Circle circle = new Circle(2);

        System.out.println("Same area ? " + equalArea(rectangle, circle));
    }                                                                                               

    private static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
        return object2.getArea() == object2.getArea();
    }
}
