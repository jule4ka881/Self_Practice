package day10_11_string;

import java.util.Scanner;

public class CydeoSchool {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your first name:" );
        String firstName = input.next();
        System.out.println("Please, enter your last name:");
        String lastName = input.next();
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        input.close();

        String firstLetter_firstName = firstName.toUpperCase().substring(0, 1);  //will be Capital
        String restOfFirstName = firstName.substring(1).toLowerCase(); //rest will be lower case

        String firstLetter_lastName = lastName.toUpperCase().substring(0,1); //first will be capital
        String restOfLastName = lastName.substring(1).toLowerCase(); //rest will be lower case

        System.out.println(firstLetter_firstName + restOfFirstName + " " + firstLetter_lastName + restOfLastName);

    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */