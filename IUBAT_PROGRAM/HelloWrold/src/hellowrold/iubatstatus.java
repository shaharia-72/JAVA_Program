/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellowrold;

/**
 *
 * @author shaha
 */
import java.util.Scanner;
public class iubatstatus {

          public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of completed semesters: ");
        int completedSemesters = scanner.nextInt();

        double[] semesterCGPAs = new double[completedSemesters];

        // Input CGPA for each completed semester
        for (int i = 0; i < completedSemesters; i++) {
            System.out.print("Enter CGPA for semester " + (i + 1) + ": ");
            semesterCGPAs[i] = scanner.nextDouble();
        }

        int semestersOnProbation = 0;
        int semestersSuspended = 0;

        for (int i = 0; i < completedSemesters; i++) {
            // Check CGPA for each completed semester
            if (semesterCGPAs[i] < 2.7) {
                semestersOnProbation++;
                if (semestersOnProbation == 2) {
                    semestersSuspended++;
                } else if (semestersOnProbation >= 3) {
                    System.out.println("You are Dismissed from IUBAT.");
                    System.exit(0);
                }
            } else {
                // Reset counters if CGPA is good
                semestersOnProbation = 0;
                semestersSuspended = 0;
            }
        }

        // Check the overall status
        if (semestersSuspended == 0) {
            System.out.println("You are in Good Standing.");
        } else if (semestersSuspended == 1) {
            System.out.println("You are on Probation.");
        } else {
            System.out.println("You are Suspended from the program.");
        }
    }
}
