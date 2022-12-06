package day04_practices;

public class SalaryCalculator2 {
    public static void main(String[] args) {
          int hourlyRate = 50,
                  weeklyHours = 45,
                  weeksYear = 52;
          double stateTaxRate = 0.06,
                  federalTaxRate = 0.26;

          double totalTaxRate = stateTaxRate * federalTaxRate;
          int salaryBeforeTax = weeklyHours * hourlyRate * weeksYear,
              federalTax = (int) (salaryBeforeTax * federalTaxRate),
              stateTax = (int) (salaryBeforeTax * stateTaxRate),
              totalTax = (int) (federalTax + stateTax),
              salaryAfterTax = (salaryBeforeTax - totalTax);

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("\tFederal tax is: $" + federalTax);
        System.out.println("\tState tax is: $" + stateTax);
        System.out.println("\tTotal tax is: $" + totalTax);
        System.out.println("\t Net income is: $" + salaryAfterTax);



    }
}
/*
Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
 */