package day09_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number :");

        int evenOdd = input.nextInt();

        if (evenOdd >=0){
            if (evenOdd % 2 == 0){
                System.out.println("This number is Even number");
            } else if (evenOdd % 2 != 0){
                System.out.println("This is Odd number");
            }
        }else{
            System.out.println("This is negative number ");
        }

        input.close();
    }
}

