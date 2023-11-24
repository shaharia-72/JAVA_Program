/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author shaha
 */

import java.util.Scanner;

public class loan {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double ammount = input.nextDouble();

        System.out.print("The number of years: ");
        int year = input.nextInt();

        input.close();

        System.out.println("Interest Rate\t Monthly Payment\t Total Payment");

        for (double annual_rate = 5.0; annual_rate <= 10.0; annual_rate += 0.25) {
            double monthly_rate = annual_rate / 12 / 100;
            double monthlypayment = totalmonthlypayment(ammount, year, monthly_rate);
            double totalPayment = monthlypayment * year * 12;

            System.out.printf("%.2f%%\t\t%.2f\t\t%.2f\n", annual_rate, monthlypayment, totalPayment);
        }
    }

    public static double totalmonthlypayment(double loanAmount, int numberOfYears, double monthlyInterestRate) {
        int numberOfMonths = numberOfYears * 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
    }
}
