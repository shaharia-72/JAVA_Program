/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab_6;

/**
 *
 * @author shaha
 */
public class vehicle {
    private String Made_by;
    private String Model_number;
    private int Lunch_year;
    private double price;

  
    public vehicle(String make, String model, int year, double price) {
        this.Made_by = make;
        this.Model_number = model;
        this.Lunch_year = year;
        this.price = price;
    }

 
    public void displayInfo() {
        System.out.println("Make: " + Made_by);
        System.out.println("Model: " + Model_number);
        System.out.println("Year: " + Lunch_year);
        System.out.println("Price: $" + price);
    }

    public void start() {
        System.out.println(Made_by + " " + Model_number + " is starting...");
    }



    public static void main(String[] args) {
      
        vehicle vehicle1 = new vehicle("Toyota", "C490E100", 2022, 30000.0);
        vehicle vehicle2 = new vehicle("Honda", " FD82R120", 2023, 40000.0);
        
        System.out.println("Vehicle 1 :");
        vehicle1.displayInfo();
        vehicle1.start();
      
        System.out.println("\nVehicle 2 :");
        vehicle2.displayInfo();
        vehicle2.start();
   
    }
    
}
