package jan_12.chapter_11.inheritence;

public class BasicTwo extends BasicOne {

    double salary;

    public BasicTwo() {
        super();
    }

    public BasicTwo(double salary) {
        this.salary = salary;
    }

    public BasicTwo(double salary, String name) {
        super(name);
        this.salary = salary;
    }

    public BasicTwo(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }

}
