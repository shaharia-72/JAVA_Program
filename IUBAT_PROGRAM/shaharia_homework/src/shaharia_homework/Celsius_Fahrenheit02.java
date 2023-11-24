/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;
/**
 *
 * @author shaha
 */
public class Celsius_Fahrenheit02 {
public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit | Fahrenheit  Celsius");
        
        for (int celsius = 0, fahrenheit = 20; celsius <= 100 && fahrenheit <= 270; celsius += 2, fahrenheit += 5) {
            double f = (celsius * 9.0 / 5.0) + 32.0;
            double c = (fahrenheit - 32.0) * 5.0 / 9.0;
            
            System.out.printf("%-7d  %-10.3f | %-11d %-6.3f%n", celsius, f, fahrenheit, c);
        }
    }
    }

