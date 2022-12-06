package day14_practices;

public class SumOfDigitsFromString {
    public static void main(String[] args) {

String a ="A1B2C3D4E5F6";
int sum = 0;

        for (int i = 0; i <=a.length()-1 ; i++) {
            if(a.charAt(i) <= '9'){
                sum+=(a.charAt(i)-48);
            }
        }
        System.out.println("Sum of digits is: " + sum);

    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */