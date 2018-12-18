package excersizes.chapter_1.practice_1_11;

public class Practice_1_11 {

    static double population = 312032486.0;
    static double birth_rate = (365 * 24 * 60 * 60.0) / 7.0;
    static double death_rate = (365 * 24 * 60 * 60.0) / 13.0;
    static double immigrant_rate = (365 * 24 * 60 * 60.0) / 45.0;

    public static void main(String[] args) {
        System.out.println("Population in first year is: " + (population + ((birth_rate - death_rate + immigrant_rate) * 1.0)));
        System.out.println("Population in second year is: " + (population + ((birth_rate - death_rate + immigrant_rate) * 2.0)));
        System.out.println("Population in third year is: " + (population + ((birth_rate - death_rate + immigrant_rate) * 3.0)));
        System.out.println("Population in fourth year is: " + (population + ((birth_rate - death_rate + immigrant_rate) * 4.0)));
        System.out.println("Population in five year is: " + (population + ((birth_rate - death_rate + immigrant_rate) * 5.0)));
    }

}
