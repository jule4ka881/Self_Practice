package day10_11_string;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter you email:");
        String email = input.next();
        String firstName = email.substring(0, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1,email.indexOf(".com"));
        String first_letter_first_name = firstName.toUpperCase().substring(0,1);
        String remaining_firstName = firstName.toLowerCase().substring(1);
        String first_letter_lastName = lastName.toUpperCase().substring(0,1);
        String remaining_lastName = lastName.toLowerCase().substring(1);

        System.out.println("First name: " + first_letter_first_name + remaining_firstName +
                "\nLast name : " +first_letter_lastName +remaining_lastName + "\nDomain: " + domain);


    }
}
/*
 Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */