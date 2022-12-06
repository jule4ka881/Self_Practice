package day16_practices;
import java.util.Scanner;
public class Rectangle {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Enter the length of the Rectangle:");
            int length = input.nextInt();

            while (length < 1) {
                System.err.println("Invalid Entry for the length of the rectangle");
                length = input.nextInt();
            }

            System.out.println("Enter the width of the Rectangle:");
            int width = input.nextInt();

            while (width < 1) {
                System.err.println("Invalid Entry for the width of the rectangle");
                width = input.nextInt();
            }

            System.out.println("Area of rectangle is: " + areaOfRectangle(length, width));
            System.out.println("Perimeter of rectangle is: " + perimeterOfRectangle(length, width));

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("no") || answer.equals("yes"))) {
                System.err.println("Invalid Entry, re-enter yes or no");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no"))
                System.exit(1);

        }while(true);

    }
    public static double areaOfRectangle(int length , int width){
        return length*width/2;
    }
    public static double perimeterOfRectangle(int length , int width){
        return 2*(length+width);
    }
}
/*
 Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */