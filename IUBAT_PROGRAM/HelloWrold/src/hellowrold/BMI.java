/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellowrold;

/**
 *
 * @author shaha
 */
import java.util.Scanner;
public class BMI {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        
        // Prompt the user to enter height in meters
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();
        
        input.close();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Interpretation
        String interpretation;
        
        if (bmi < 16) {
            interpretation = "Seriously underweight";
        } else if (bmi >= 16 && bmi < 18) {
            interpretation = "Underweight";
        } else if (bmi >= 18 && bmi < 24) {
            interpretation = "Normal weight";
        } else if (bmi >= 24 && bmi < 29) {
            interpretation = "Overweight";
        } else {
            interpretation = "Seriously overweight (Gravely overweight)";
        }
        
        // Display the BMI value and interpretation
        System.out.println("BMI Value: " + bmi);
        System.out.println("Interpretation: " + interpretation);
    }
}
