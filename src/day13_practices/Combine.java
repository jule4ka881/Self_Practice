package day13_practices;
import java.util.Scanner;
public class Combine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        System.out.println(combine(word1,word2));
    }

    public static String combine(String word1, String word2){
        String result = "";
        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            result = word1.substring(0,word1.length()-1)+ word2.substring(0);
        }else{
            result = word1 + word2;

        }
        return result;
    }

}
/*
 Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */