package day13_practices;
import java.util.Scanner;
public class FrequencyOfWord {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String s = input.nextLine();
        System.out.println("Enter word: ");
        String w = input.next();

        System.out.println(frequencyOfWord(s,w));
        input.close();

    }
    public static int frequencyOfWord(String sentence,String word){
        sentence = sentence.toLowerCase();
        String copy = sentence.replace(word.toLowerCase(),word.substring(1).toLowerCase());
        int result = sentence.length()-copy.length();
        return result;
    }

}
/*
Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */