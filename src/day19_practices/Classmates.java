package day19_practices;

public class Classmates {

    public static void main(String[] args) {


        String[] classmates ={"Kay Moss","May Chuck","Raghad Cox","Daniel Tull",
        "Harrison Tull","Yana Tull","Reggie Tull","Yulia Driggers","Fay Stevenson",
        "Jennifer Krank"};

        String initials = "";

        for (int i = 0; i < classmates.length; i++) {
                                    //first index
            initials = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ")+1) +".";

            System.out.println(initials);
        }



    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */