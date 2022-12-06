package day13_practices;
import java.util.Scanner;
public class IsOdd {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println(isOdd(9));
        System.out.println(isEven(17));

    }

    public static boolean isOdd(int num){
        return (num%2 !=0)?true : false;


    }
public static boolean isEven(int num){
        return !isOdd(num);
}


}
/*
1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false


2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false


 */