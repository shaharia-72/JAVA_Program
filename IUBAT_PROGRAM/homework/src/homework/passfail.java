package homework;

import java.util.Scanner;
import java.util.Scanner;
public class passfail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //make chnage (input)
        while(true)
        {
            System.out.print("Enter your java score. for exit use -1\n"); //make chnage (Enter your java score. for exit use -1\n)
            int score = input.nextInt();          
            if (score == -1)
            {
                System.out.print("Exiting.........\n"); //make chnage (Exiting.........\n)
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
