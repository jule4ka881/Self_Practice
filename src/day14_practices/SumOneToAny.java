package day14_practices;

import java.util.Scanner;

public class SumOneToAny {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers, the first one should be 1");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
/*
 write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */