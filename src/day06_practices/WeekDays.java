package day06_practices;

public class WeekDays {
    public static void main(String[] args) {

        int number = 1;
        boolean monday = number == 1,
                tuesday = number == 2,
                wednesday = number == 3,
                thursday = number == 4,
                friday = number == 5,
                saturday = number == 6,
                sunday = number == 7;
        String result = " ";

        if(number == 1){
            System.out.println("Monday");
        }
        if(number == 2){
            System.out.println("Tuesday");
        }
        if(number == 3){
            System.out.println("Wednesday");
        }
        if(number == 4){
            System.out.println("Thursday");
        }
        if(number == 5){
            System.out.println("Friday");
        }
        if(number == 6){
            System.out.println("Saturday");
        }
        if(number == 7){
            System.out.println("Sunday");
        }


    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents
Ex:
Given:
number = 1
output:
Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */