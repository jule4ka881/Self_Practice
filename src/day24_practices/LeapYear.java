package day24_practices;
import java.time.LocalDate;
public class LeapYear {


    public static boolean isLeapYear(int birthYear) {
        return LocalDate.of(birthYear, 1, 1).isLeapYear();
    }
}
//int year =1995;
        //boolean isLeapYear = year%4==0;
    //System.out.println(isLeapYear);

   /*
    Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false

    */