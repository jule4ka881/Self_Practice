package day20_practices;

public class LoveJava {
    public static void main(String[] args) {

        String str = "I Love Java";
        String[] arr = str.split("");
        //to split the string into 3 elements[I,Love,Java]
        //now we can work with them
        String reverse = "";
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            //array for loop to find 3 elements
            if (i == 1) { //for the 2nd element Love with index 1


                for (int j = arr[i].length() - 1; j >= 0; j--) { //reverse 2nd word
                    //j is getting 2nd word from the last index and going
                    //to the first index 0 in decrement order

                    reverse += arr[i].charAt(j);
                    //charAt to get each elemment and store it to the empty string reverse
                    //reverse = reverse+arr[i].charAt(j); ->>> the same code
                }
                arr[i] = reverse; //the array arr is being reassigned to a new one = reverse

            }
            result += arr[i] + ""; //the result will be the new array plus " " space
            //to the words not to get printed together
        }
        System.out.println(reverse); // print the result
    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */