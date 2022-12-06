package day14_practices;

public class DigitsLettersSpecialCharacters {
    public static void main(String[] args) {
        String a = "mn@#123Ab!";
        String letter = "";
        String number = "";
        String special_char = "";

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'||a.charAt(i)>= 'A' && a.charAt(i)<= 'Z'){
                letter += a.charAt(i);
            }else if(a.charAt(i)>= '1' && a.charAt(i) <= '9'){
                number+=a.charAt(i);
            }else{
                special_char+=a.charAt(i);
            }
        }
        System.out.println("letters: "+ letter + "\n Numbers: "+ number +"\nSpecial Char: "+ special_char);



    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */