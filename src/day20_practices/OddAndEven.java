package day20_practices;

public class OddAndEven {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11};

        int countEven = 0;
        int countOdd = 0;

        for (int each : array) {
            if(each%2 != 0){
                countEven=each;
            }else{
                countOdd=each;
            }
            System.out.println("Even number is: "+countEven);
            System.out.println("Odd number is: " +countOdd);
            }
        }



    }

