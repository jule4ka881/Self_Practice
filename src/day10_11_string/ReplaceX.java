package day10_11_string;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a word:");
        String word = input.next();

        String xChar ="xcodeX";
        System.out.println(xChar.replace('x', 'a').replace('X', 'a'));

    }
}
