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
public class score {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String highest_name = "";
        double highest_mark = Double.MIN_VALUE;
        
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        
        for (int i = 1; i<=number; i++)
        {
            System.out.print("Enter the student name -> "+ i + ": " );
            String name = input.next();
            
            System.out.print("Enter the student score -> "+ i + ": " );
            double scores = input.nextDouble();
            
            if (scores > highest_mark) {
                highest_mark = scores;
                highest_name = name;
            }
        }

        input.close();

        if (!highest_name.isEmpty()) {
            System.out.println("highest score:");
            System.out.println("Name: " + highest_name);
            System.out.println("Score: " + highest_mark);
        } else {
            System.out.println("Enter wrong");
        }
        }
    }
    
