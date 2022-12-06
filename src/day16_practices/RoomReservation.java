package day16_practices;
import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room?(yes/no)");
        String doYouWantReservation = input.next().toLowerCase();

        while (!(doYouWantReservation.equals("yes") || doYouWantReservation.equals("no"))) {
            System.err.println("Invalid entry.Re-enter(yes/no)");
            doYouWantReservation = input.next();
        }

        if (doYouWantReservation.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day!");
            System.exit(1);
        }
        do {

            input.nextLine();
            System.out.println("What type of room you want to reserve?:");
            String typeOfRoom = input.nextLine().toLowerCase();
            while (!(typeOfRoom.equals("king bed") || typeOfRoom.equals("queen bed") || typeOfRoom.equals("single bed"))) {
                System.err.println("Invalid type of room.Re-enter type of room");
                typeOfRoom = input.nextLine();
            }

            System.out.println("How many nights do you need?:");
            int nights = input.nextInt();

            while(nights<1|| nights>365){
                System.err.println("Invalid entry.Re-enter number of nights: ");
                nights = input.nextInt();
            }


            System.out.println("Would you like to reserve another room?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid entry.Re-enter yes or no");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no")){

                int result=0;

                switch (typeOfRoom){
                    case "king bed":
                        System.out.println("Total price is: $"+(120*nights));break;
                    case "queen bed":
                        System.out.println("Total price is: $"+(100*nights));break;
                    default:
                        System.out.println("Total price is: $"+(80*nights));
                }
                System.exit(1);
            }
        }while (true);
    }
}
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */