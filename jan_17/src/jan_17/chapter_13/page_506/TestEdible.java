package jan_17.chapter_13.page_506;

public class TestEdible {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for (Object object : objects) {
            if (object instanceof Edible) {
                System.out.println(((Edible) object).howToEat());
            }
            if (object instanceof Animal) {
                System.out.println(((Animal) object).sound());
            }
        }
    }
}
