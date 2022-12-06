package day06_practices;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '1';
        String result = " ";

        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 112) {
            System.out.println("Alphabet character ");
        }
        if (ch >= 49 && ch <= 57) {
            System.out.println("Digits");
        }
        if (ch >= 0 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96
                || ch >= 113 && ch <= 127) {
            System.out.println("Special Character");

        }
    }
}
/*
 Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */