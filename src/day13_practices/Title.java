package day13_practices;

public class Title {
    public static void main(String[] args) {
       title("JaVa");
        System.out.println(title("JaVa"));



    }

    public static String title(String word){
        word = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        return word;
    }


}
