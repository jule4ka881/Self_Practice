package day10_11_string;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {
        String webSite = "www.study.com";
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your website");

        String url = input.nextLine();
        boolean startsWith = url.startsWith("www.");
        boolean endsEdu = url.endsWith (".edu");
        boolean endsGov = url.endsWith(".gov");
        boolean endsCom = url.endsWith(".com");

        if(startsWith && endsCom || endsGov || endsEdu){
            System.out.println("This website is valid");
        }else{
            System.out.println("This website is not valid");
        }
        input.close();
    }
}
/*
write a program that can check if the given website is valid website or not
starts with : www.
ends with: .com, .edu, .gov
 */




