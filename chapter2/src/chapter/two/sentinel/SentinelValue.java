/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.two.sentinel;

import java.util.Scanner;

public class SentinelValue {

    static int n;
    static int sum;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while (n != 7) {
            n = sn.nextInt();
            if (n != 7) {
                sum += n;
            }
        }
        System.out.println("Sum until enter 7 : " + sum);
    }
}
