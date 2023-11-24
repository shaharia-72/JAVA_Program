/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double annual_increase = 0.06;
        int number_of_years = 10;
        int year_of_tuition = 4;

 
        for (int year = 1; year <= number_of_years; year++) {
            tuition += tuition * annual_increase;
            if (year == 1) {
                System.out.printf("Year %d tuition: $%.2f%n", year, tuition);
            } else if (year == number_of_years) {
                System.out.printf("Year %d tuition: $%.2f%n", year, tuition);
            }
        }


        double cost_after_4years = 0;
        for (int year = 1; year <= year_of_tuition; year++) {
            tuition += tuition * annual_increase;
            cost_after_4years += tuition;
        }

        System.out.printf("Total cost of %d years's : $%.2f%n", year_of_tuition, cost_after_4years);
    }
    
}
