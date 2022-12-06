package day10_11_string;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first word:");
        String word1 = input.next();
        System.out.println("Please, enter your second word");
        String word2 = input.next();

        input.close();
       String selectChar1 = word1.substring(1);
       String selectChar2 = word2.substring(1);
        System.out.println(selectChar1+selectChar2);

    }
}
/*
 Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */