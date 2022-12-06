package day08_practices;

public class OxygenTank {
    public static void main(String[] args) {
        /*

4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary

         */
        int number=49;
        String level=(number>=90 && number<105)?"Your tank is full":
                (number>=80)?"Still okay":(number>=70)?"Don't go too far":
                        (number>=60)?"Start to head back":(number>=50)?
                                "Be careful now you at 50%":(number<50)?
        "Below 50%":"Invalid level";
        System.out.println(level);





    }
}
