package jan_12.chapter_11.inheritence;

public class BasicOne {

    int id;
    String name;
    String color;

    //
    public BasicOne() {
    }

    public BasicOne(int id) {
        this.id = id;
    }

    public BasicOne(String name) {
        this.name = name;
    }

    public BasicOne(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public BasicOne(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BasicOne(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

}
