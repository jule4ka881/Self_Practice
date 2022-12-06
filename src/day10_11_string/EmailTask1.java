package day10_11_string;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //so we can use scanner

        System.out.println("Enter your email:"); //we ask

        String email = input.next(); //so user can print

        if(email.contains("_")){
            String name = email.substring(0,email.indexOf('_'));
            String lastName = email.substring((email.indexOf('_')+1),email.indexOf('@'));
            System.out.println(lastName + "_" + name + email.substring(email.indexOf('@')));
        }else{
            System.out.println(email);
        }


    }
}
/*
 Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */