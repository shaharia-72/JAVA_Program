/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaharia_homework;

/**
 *
 * @author shaha
 */
public class ascii {
     public static void main(String[] args) {
        
        char first_char = '!';
        char last_char = '~';

        int count = 0;

        for (char ch = first_char; ch <= last_char; ch++) {
            System.out.print(ch + " ");
            count++;

            if (count % 10==0) {
                System.out.println();
                count = 0;
            }
        }
    }
    
}
