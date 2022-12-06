package day16_practices;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do{

            System.out.println("Enter the radius of the circle:");
            int r= input.nextInt();

            while (r<1){
                System.err.println("Invalid Entry for the radius of the circle. Radius must be greater than 0, re-enter again");
                r= input.nextInt();
            }

            System.out.println("Diameter of circle is: "+diameterOfTheCircle(r));
            System.out.println("Area of circle is: "+areaOfTheCircle(r));
            System.out.println("Perimeter of circle is "+perimeterOfTheCircle(r));

            System.out.println("Would you like to calculate another circle?");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid Entry, re-enter yes or no");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no"))
                System.exit(1);

        }while(true);
    }
    public static double diameterOfTheCircle(int r){
        return r*2;
    }
    public static double perimeterOfTheCircle(int r){
        return 2*3.14*r;
    }
    public static double areaOfTheCircle(int r){
        return 3.14*r*r;
    }
}

/*

4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */