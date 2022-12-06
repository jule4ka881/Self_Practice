package day16_practices;

import java.util.Scanner;

public class SquareTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entryCheck = true;
        String userAnswer = "";
        int area, perimeter = 0;
        int a = 0;

        while (entryCheck){
            System.out.println("Enter the side of the square:");

            a = scanner.nextInt();

            if(a == 0 || a < 0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }
            area = a*a;
            perimeter = 4*a;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            boolean check = true;
            while (check){
                System.out.println("Would you like to calculate another Square?");
                userAnswer = scanner.next();
                if(userAnswer.equalsIgnoreCase("yes")){
                    check = false;
                }else if(userAnswer.equalsIgnoreCase("no")){
                    System.exit(1);
                }else {
                    System.out.println("Please try again for your input");
                }
            }


        }

        }

    }
/*
Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */
