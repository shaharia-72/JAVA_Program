/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
import java.util.Scanner;
public class pass_or_fail_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        while(true)
        {
            System.out.print("Enter your java score. for exit use -1\n");
            int score = input.nextInt();
            
            if (score == -1)
            {
                System.out.print("Exiting.........\n");
                break;
            }
            
            if (score >= 60)
            {
                System.out.print("you pass the exam\n");
            }
            
            else 
            {
                System.out.print("you din't pass the exam\n");
            }
            
        }
        input.close();
    }
    
}
