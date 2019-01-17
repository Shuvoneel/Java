package jan_10.chapter_10.page_177;

public class TestCourse {
    
    public static void main(String[] args) {
        Course course1 = new Course("Data");
        Course course2 = new Course("Database");
        
        course1.addStd("Mehedi");
        course1.addStd("Hasan");
        course1.addStd("Shuvo");
        
        course2.addStd("Shuvo");
        course2.addStd("Rocky");
        course2.addStd("Rony");
        
        System.out.println("Num of Students in course1: " + course1.getNumOdStd());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumOdStd(); i++) {
            System.out.println(students[i] + " ");
        }
        
        System.out.println();
        System.out.println("Num of Students in course2: " + course2.getNumOdStd());
        String[] students1 = course2.getStudents();
        for (int j = 0; j < course2.getNumOdStd(); j++) {
            System.out.println(students1[j] + " ");
        }
    }
}
