package day16_practices;

public class Shape {
    public static void main(String[] args) {

        int count=0;

        for (int i = 0; i < 10; i++) {
            if(count>9)
                break;
            for (int j = 0; j< count; j++){
                System.out.print("* ");
            }
            System.out.print("* \n");
            count++;
        }

    }
}
/*
Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */
