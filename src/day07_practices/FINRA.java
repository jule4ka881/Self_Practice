package day07_practices;

public class FINRA {
    public static void main(String[] args) {

        int number = 10;
        String result = "";

        if(number % 3 == 0 || number % 5 == 0 || number % 15 == 0) {

            if (number % 15 == 0) {
                result = "FINRA";
            } else if (number % 3 == 0) {
                result = "FIN";
            } else {
                result = "RA";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);


    }
}
