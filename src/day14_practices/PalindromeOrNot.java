package day14_practices;

public class PalindromeOrNot {
    public static void main(String[] args) {

String word = "level";
String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);

    }
}
/*
 Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true
 */