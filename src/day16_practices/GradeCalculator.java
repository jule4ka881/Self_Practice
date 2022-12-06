package day16_practices;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do{

            System.out.println("Enter your score:");
            int score = input.nextInt();

            while(score<0||score>100){
                System.err.println("Invalid Entry, re-enter your score:");
                score = input.nextInt();
            }

            char grade;

            if(score<60){
                grade = 'F';
            }else if(score<70){
                grade = 'D';
            }else if(score<80){
                grade = 'C';
            }else if(score<90){
                grade = 'B';
            }else {
                grade ='A';
            }

            System.out.println("Your grade is "+grade);

            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid Entry, re-enter yes or no");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(1);
            }

        }while (true);
    }


}
/*
 Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */