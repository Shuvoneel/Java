package jan_17.chapter_13.compareToInterface.page_510;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObj {

    public static void main(String[] args) {
        String[] cities = {"Savanah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNum = {new BigInteger("2323231092923992"), new BigInteger("432232323239292"), new BigInteger("54623239292")};
        Arrays.sort(hugeNum);
        for (BigInteger number : hugeNum) {
            System.out.println(number + " ");
        }
    }
}
