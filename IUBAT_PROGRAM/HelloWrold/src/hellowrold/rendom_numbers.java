/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellowrold;

import java.util.Random;

/**
 *
 * @author shaha
 */

public class rendom_numbers {
     public static void main(String[] args) {
        int totalPoints = 1000000; // Number of random points to generate
        int pointsInsideCircle = 0; // Counter for points inside the circle

        Random random = new Random();

        for (int i = 0; i < totalPoints; i++) {
            // Generate random coordinates within the square
            double x = random.nextDouble();
            double y = random.nextDouble();

            // Calculate the distance from the origin (0, 0)
            double distance = Math.sqrt(x * x + y * y);

            // Check if the point is inside the circle (distance <= 1)
            if (distance <= 1) {
                pointsInsideCircle++;
            }
        }

        // Calculate the estimated value of π
        double estimatedPi = 4.0 * pointsInsideCircle / totalPoints;

        System.out.println("Estimated Pi: " + estimatedPi);
    }
    
}
