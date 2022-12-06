package day06_practices;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = 3;
        String result = "";

        if(selection == 1){
            result = "Hello, thank you for your call";
        }else if (selection == 2){
            result = "Hola, gracias para 11amar";
        }else if (selection == 3){
            result = " Merhada, aradiginiz icin tesekkurler";
        }else if (selection == 4){
            result = "Privet, spasibo za vash zvonok";
        }else {
            result = "Merci, pour votre appel";
        }
        System.out.println(result);

    }
}
/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement


 */