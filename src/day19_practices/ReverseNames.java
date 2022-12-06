package day19_practices;

public class ReverseNames {
    public static void main(String[] args) {

        String[] classmates = {"Kay Moss", "May Chuck", "Raghad Cox", "Daniel Tull",
                "Harrison Tull", "Yana Tull", "Reggie Tull", "Yulia Driggers", "Fay Stevenson",
                "Jennifer Krank"};
        for (int i = 0; i < classmates.length; i++) { //goes through each name

            String name_reverse = "";
            

            for (int j = classmates[i].length() - 1; j >= 0; j--) {
                name_reverse += classmates[i].charAt(j);


            }
            System.out.println(name_reverse);
        }
    }
        }

/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */