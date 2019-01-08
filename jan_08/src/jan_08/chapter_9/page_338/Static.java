package jan_08.chapter_9.page_338;

public class Static {
    
    int x = 7;
    static int y = 3;
    
    public static void main(String[] args) {
        Static var1 = new Static();
        System.out.println("x: " + var1.x);
        System.out.println("y: " + y);
        System.out.println("Sum with bonus: " + var1.makeSum(5));
    }
    
    public int makeSum(int bonus) {
        int sum = x + y + bonus;
        return sum;
    }
    
}
