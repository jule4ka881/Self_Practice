package day08_practices;

public class ChooseLanguage {
    public static void main(String[] args) {
      /*

5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statemen
       */

        int n=5;
        String language = (n==1)?"Hello":(n==2)?"Hola":(n==3)?"Merhaba":
                (n==4)?"Privet":(n==5)?"Merci":"Invalid Number";
        System.out.println(language);   ////////This is ternary


    }
}
