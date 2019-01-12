package jan_12.chapter_11.inheritence;

public class BasicThree extends BasicTwo {

    String department;

    public BasicThree() {
        super();
    }

    public BasicThree(String department) {
        this.department = department;
    }

    public BasicThree(String department, double salary) {
        super(salary);
        this.department = department;
    }

    public BasicThree(String department, double salary, int id, String name, String color) {
        super(salary, id, name, color);
        this.department = department;
    }

}
