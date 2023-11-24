/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author shaha
 */
import java.util.Scanner;
public class schores {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String highest_name = ""; // make changes in variable 
        double highest_mark = Double.MIN_VALUE; // make changes in variable 
        
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        
        for (int i = 1; i<=number; i++)
        {
            System.out.print("Enter the student name -> "+ i + ": " ); // make changes in writing  
            String name = input.next();
            
            System.out.print("Enter the student score -> "+ i + ": " ); // make changes in writing  
            double scores = input.nextDouble();
            
            if (scores > highest_mark) {
                highest_mark = scores;
                highest_name = name;
            }
        }

        input.close();

        if (!highest_name.isEmpty()) {
            System.out.println("highest score:"); // make changes in writing  
            System.out.println("Name: " + highest_name);// make changes in writing  
            System.out.println("Score: " + highest_mark);// make changes in writing  
        } else {
            System.out.println("Enter wrong");// make changes in writing  
        }
        }
    
}
