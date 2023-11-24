package homework;

import java.util.Scanner;
public class cel {
     public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Celsius is: "); // make change 
        float celsius = input.nextFloat();
        
        float fahrenheit = (celsius * 9/5 + 32);
        
        System.out.print("If Celsius is "+celsius + " Then fahrenheit is "+ fahrenheit+"\n"); // make change in formate
        
    }
}
