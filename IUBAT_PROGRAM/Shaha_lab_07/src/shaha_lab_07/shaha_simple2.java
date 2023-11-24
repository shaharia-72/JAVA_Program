/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shaha_lab_07;

/**
 *
 * @author shaha
 */
public class shaha_simple2 {
    public static void main(String[] args) {
        try{
            int a=50/0;
               }
        catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception occurs" + e);
            }
        catch(Exception e)
            {
                System.out.println("Exception occurs" + e);
            }
        System.out.println("rest of the code");    
    }  
}
