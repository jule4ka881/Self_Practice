package day14_practices;

import java.util.Scanner;

public class ForLoopTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            min = input.nextInt();
        }


        System.out.println("min = " + min);
    }
}