/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;
/**
 *
 * @author shaharia
 */
import java.util.Scanner;
public class grading {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student mark: ");
        int mark = scanner.nextInt();

         int gradeRange = (mark >= 90) ? 90 : (mark >= 87) ? 87 : (mark >= 85) ? 85 : (mark >= 79) ? 79 : (mark >= 75) ? 75 : (mark >= 69) ? 69 : (mark >= 65) ? 65  :(mark >= 60) ? 60 : 0;
 
        String grade = calculateGrade(gradeRange);

        System.out.println("The grade for the mark " + mark + " is " + grade);
    }

    public static String calculateGrade(int gradeRange) {
      
        switch (gradeRange) {
            case 90:
                return "A";
            case 87:
                return "B+";
            case 85:
                return "B";
            case 79:
                return "B-";
            case 75:
                return "C+";
            case 69:
                return "C";
            case 65:
                return "C-";
           
            case 60:
                return "D";
            default:
                return "F";
        }
    }

}
