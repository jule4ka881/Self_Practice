package day08_practices;

public class NumberToWord {
    public static void main(String[] args) {
/*
Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

 */
        int n = 1; //0~9

        String word=(n==0)?"Zero":(n==1)?"One":(n==2)?"Two":(n==3)?"Three":(n==4)?
                "Four":(n==5)?"Five":(n==6)?"Six":(n==7)?"Seven":(n==8)?
                "Eight":(n==9)?"Nine":"Invalid";
        System.out.println(word);
    }
}
