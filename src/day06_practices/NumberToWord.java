package day06_practices;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 1;
        String word = " ";

        if(number == 0){
            word = "Zero";
        }
        if(number == 1){
            word = "One";
        }
        if(number == 2){
            word = "Two";
        }
        if(number == 3){
            word = "Three";
        }
        if(number == 4){
            word = "Four";
        }
        if(number == 5){
            word = "Five";
        }
        if(number == 6){
            word = "Six";
        }
        if(number == 7){
            word = "Seven";
        }
        if(number == 8){
            word = "Eight";
        }
        if(number == 9){
            word = "Nine";
        }
        System.out.println(word);

    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */