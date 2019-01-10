package jan_10.chapter_10.page_177;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numOfStd;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStd(String student) {
        students[numOfStd] = student;
        numOfStd++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumOdStd() {
        return numOfStd;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStd(String student) {
        String[] students3 = new String[students.length - 1];
        for (int i = 0, j = 0; i < students.length; i++, j++) {
            if (students[i] == student) {
                j++;
            }
            students3[i] = students[j];
        }
        this.students = students3;
        numOfStd--;
    }
}
