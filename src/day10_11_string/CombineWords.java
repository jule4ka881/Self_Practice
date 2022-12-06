package day10_11_string;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first word:");
        String word1 = input.next();
        System.out.println("Please, enter your second word");
        String word2 = input.next();

        String result = "";

        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            result= word1.substring(0, word1.length()-1) + word2.substring(0);
        }else{
            result = word1 + word2;
        }

        System.out.println(result);

    }
}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */