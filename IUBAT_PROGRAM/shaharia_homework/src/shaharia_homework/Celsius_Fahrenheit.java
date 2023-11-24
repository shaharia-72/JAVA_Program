/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Celsius is: ");
        float celsius = input.nextFloat();
        
        float fahrenheit = (celsius * 9/5 + 32);
        
        System.out.print("If Celsius is "+celsius + " Then fahrenheit is "+ fahrenheit+"\n");
        
    }
    
}
