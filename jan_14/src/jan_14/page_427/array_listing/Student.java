
package jan_14.page_427.array_listing;

public class Student {
    private int id;
    private String name;
    private String mobileNo;

    public Student(int id, String name, String mobileNo) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }
    
    
}
