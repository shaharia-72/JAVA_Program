/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class divisible3_402 {
     public static void main(String[] args) {
        int count = 0;
        
        for (int number = 100; number <= 200; number++)
        {
            if ((number %3 ==0 || number %4 ==0) && !(number%3 == 0 && number %4 == 0)) ;
            {
                System.out.print(number + " ");
                count++;

                if (count % 10 == 0) 
                {
                    System.out.println();
                }
            }
        }
    }
    
}
