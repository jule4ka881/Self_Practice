package day06_practices;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 1;
        boolean has28Days = number == 2,
                has30Days = number == 4 || number == 6 || number == 9 || number == 11,
                has31Days = number ==1 || number == 3 || number == 5
                        || number == 7 || number == 8 || number == 10 || number == 12;
        String result = " ";
        if(has28Days){
            result = "28 days";
        }
        if(has30Days){
            result = "30 days";
        }
        if(has31Days){
            result = "31 days";
        }

    }
}
