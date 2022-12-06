package day14_practices;

import java.util.Scanner;

public class ForLoopPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0; // it will be bug if there is a negative number, check java programing day 15

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            max=input.nextInt();
        }
        System.out.println("max = "+ max);


    }
}
