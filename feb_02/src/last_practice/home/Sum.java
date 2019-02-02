package last_practice.home;

public class Sum {

    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (n <= 10) {
            if(n%2 == 0){
                sum += n;
            }
            n++;
        }
        System.out.println(sum);
    }
}
