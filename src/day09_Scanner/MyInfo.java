package day09_Scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" please enter your age");
        int age = input.nextInt();
        System.out.println("please enter your gender");
        String gender = input.next();
        System.out.println("Please enter your full name");

        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("Please enter your phone number");
        long phoneNumber = input.nextLong();
        System.out.println("Please enter your zip code");
        int zipCode = input.nextInt();
        System.out.println("Please enter your school name");

        input.nextLine();
        String schoolName = input.nextLine();
        System.out.println("Please enter your city name");
        String cityName = input.nextLine();
        System.out.println("Please enter your state name");
        String stateName = input.nextLine();
        System.out.println("Please enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("Please enter your Street name");
        String streetName = input.nextLine();

        String address = ("\t" + buildingNumber +" "+ streetName + "\n" + "\t" + cityName + ","+ stateName +" " + zipCode);

        System.out.println("1. " + fullName);
        System.out.println("2. " + age);
        System.out.println("3. " + gender);
        System.out.println("4. " + phoneNumber);
        System.out.println("6. " + schoolName);








    }
}
/*
 Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name


 */