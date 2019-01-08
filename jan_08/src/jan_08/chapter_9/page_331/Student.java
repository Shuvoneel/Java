package jan_08.chapter_9.page_331;

public class Student {

    String name;
    int age;
    boolean isScienceMajor;
    char gender;

    // Way-1: Using default constructor...........
    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsScienceMajor(boolean isScienceMajor) {
        this.isScienceMajor = isScienceMajor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }
   
}
