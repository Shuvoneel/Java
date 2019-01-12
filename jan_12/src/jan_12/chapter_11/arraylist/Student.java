
package jan_12.chapter_11.arraylist;

public class Student {
    private int id;
    private String name;
    private int roll;

    public Student(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", roll=" + roll + '}';
    }
    
}
