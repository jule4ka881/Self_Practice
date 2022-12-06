package day10_11_string;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a word:");
        String word = input.next();

        String xChar ="xcodex";
        System.out.println(xChar.replace("xc", "ac"));

    }
}
/*
 Create a class named StartsWithX and write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */