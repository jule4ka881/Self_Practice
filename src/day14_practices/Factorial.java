package day14_practices;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        double n = scan.nextInt();
        double result = 1;

        for (int i = (int)n; i >= 1; i--) {
            result *= i;
        }
        System.out.println("result = " + result);
        scan.close();
    }

}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */