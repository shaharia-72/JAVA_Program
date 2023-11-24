/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author shaha
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {10,20,30,40};
        
        int [] result = new int[arr1.length];
        
        for(int i=0; i<arr1.length; i++)
        {
            result[i] = arr1[i]+arr2[i];
        }
        
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    
}
