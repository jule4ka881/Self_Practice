package day04_practices;

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Daniel",
                age = "28",
                gender = "Male",
                companyName ="Google Inc",
                jobTitle = "Software developer";
        int salary = 90000;

        System.out.println(name + " is " + age + " years old" + ", "
        + "gender is " + gender + ".\n" + name + " works at " + companyName + " as a "
                + jobTitle + ".\n" + name + " makes $ " + salary + " per year.");

    }
}
