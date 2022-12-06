package day04_practices;

public class SwapTwoVariables1 {
    public static void main(String[] args) {

        int x = 10,
            y = 15;
        int z = y - x;


        System.out.println("x = " + (x + z));
        System.out.println("y = " + (y + z));
        /*
        x = x * y; //10 * 15 = 150
        y = x / y; //150 / 15 =10
        x = x / y; //150 / 10 = 15
        y = y + y; //10 + 10 =20

         Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20
         */
    }
}
