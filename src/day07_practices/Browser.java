package day07_practices;

public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";
        String result = " Browser is selected";

        if(browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
        browserName == "Safari" || browserName == "edge"){
            if(browserName == "chrome"){
                result = browserName + result;
            }else if(browserName == "firefox"){
                result = browserName + result;
            }else if(browserName == "opera"){
                result = browserName + result;
            }else if(browserName == "safari"){
                result = browserName + result;
            }else{
                result = browserName + result;
            }



        }else{
            result = "Invalid Browser Name";
        }
        System.out.println(result);




    }
}
/*
Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */