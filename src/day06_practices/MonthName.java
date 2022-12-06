package day06_practices;

public class MonthName {
    public static void main(String[] args) {

        int number = 10;
        boolean january = number == 1,
                february = number == 2,
                march = number == 3,
                april = number == 4,
                may = number == 5,
                june = number == 6,
                july = number == 7,
                august = number == 8,
                september = number == 9,
                october = number == 10,
                november = number == 11,
                december = number ==12;
        String result = " ";
        if(number == 1){
            System.out.println("January");
        }
        if(number == 2){
            System.out.println("February");
        }
        if(number == 3){
            System.out.println("March");
        }
        if(number == 4){
            System.out.println("April");
        }
        if(number == 5){
            System.out.println("May");
        }
        if(number == 6){
            System.out.println("June");
        }
        if(number == 7){
            System.out.println("July");
        }
        if(number == 8){
            System.out.println("August");
        }
        if(number == 9){
            System.out.println("September");
        }
        if(number == 10){
            System.out.println("October");
        }
        if(number == 11){
            System.out.println("November");
        }
        if(number == 12){
            System.out.println("December");
        }
    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents
Ex:
Given:
number = 10
output: October
 */