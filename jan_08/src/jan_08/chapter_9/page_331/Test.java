package jan_08.chapter_9.page_331;

public class Test {
    
    public static void main(String[] args) {

        //Way-1..................................
        Student std1 = new Student();
        std1.name = "Shuvo";
        std1.age = 29;
        std1.isScienceMajor = true;
        std1.gender = 'M';
        std1.setAge(28);    // Override.....
        
        System.out.println(".......Way - 1.............");
        System.out.println("name ? " + std1.name);
        System.out.println("age ? " + std1.age);
        System.out.println("is Science Major ? " + std1.isScienceMajor);
        System.out.println("gender ? " + std1.gender);

        //Way-2.............................
        Student std2 = new Student();
        std2.setName("Mehedi");
        std2.setAge(27);
        std2.setIsScienceMajor(true);
        std2.setGender('M');
        std2.setName("Nazmul");    // Override.....
        
        System.out.println("");
        System.out.println(".......Way - 2.............");
        System.out.println("name ? " + std2.name);
        System.out.println("age ? " + std2.age);
        System.out.println("is Science Major ? " + std2.isScienceMajor);
        System.out.println("gender ? " + std2.gender);

        //Way-3......................................
        Student std3 = new Student("Hasan", 25, true, 'M');
        std3.setIsScienceMajor(false);  // Override.....
        
        System.out.println("");
        System.out.println(".......Way - 3.............");
        System.out.println("name ? " + std3.name);
        System.out.println("age ? " + std3.age);
        System.out.println("is Science Major ? " + std3.isScienceMajor);
        System.out.println("gender ? " + std3.gender);

        //Way-4..............(Better)...........................
        Studenttt std4 = new Studenttt("Shirin", 30, true, 'F');
        
        System.out.println("");
        System.out.println(".......Way - 4.............");
        System.out.println("name ? " + std4.getName());
        System.out.println("age ? " + std4.getAge());
        System.out.println("is Science Major ? " + std4.isIsScienceMajor());
        System.out.println("gender ? " + std4.getGender());
    }
}