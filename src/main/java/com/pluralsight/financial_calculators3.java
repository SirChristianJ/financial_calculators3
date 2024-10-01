package com.pluralsight;
import java.util.*;

public class financial_calculators3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double monthlyPayout = promptUserForValues("Enter monthly payout: $");
        double interestAmount = promptUserForValues("Enter expected interest rate: ");
        double yearsLength = promptUserForValues("Enter number of years: ");

        displayEndingBalance(monthlyPayout, interestAmount, yearsLength);
    }

    public static double promptUserForValues(String prompt){

        System.out.print(prompt);

        return scanner.nextDouble();
    }

    public static void displayEndingBalance(double deposit, double interest, double years){
        interest = (interest/100)/12;
        double paymentFormula = deposit * (1 - ((1/Math.pow(1+interest,years*12 )))) / interest;
        System.out.println("To fund an annuity that pays $" + String.format("%.2f" , deposit) +  " monthly for " + years + " years and earns an expected "+ String.format("%.2f" , interest*100*12) + "% interest, you would need to invest $" + String.format("%.2f", paymentFormula) + " today.");

        //return paymentFormula;
    }
}
