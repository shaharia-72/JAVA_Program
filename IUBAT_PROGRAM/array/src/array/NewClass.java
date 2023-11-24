/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author shaha
 */
// Interface representing Vegetarian
public interface Vegetarian {
    void eat();
}

// Base class representing Animal
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}

// Deer class extending Animal and implementing Vegetarian
public class Deer extends Animal implements Vegetarian {
    public Deer(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating grass");
    }

    // Additional method specific to Deer
    void run() {
        System.out.println(name + " is running");
    }

    // Overriding the makeSound method from the Animal class
    @Override
    void makeSound() {
        System.out.println(name + " makes a gentle sound");
    }

    public static void main(String[] args) {
        Deer bambi = new Deer("Bambi");

        // Using methods from both Animal and Deer classes
        bambi.makeSound();
        bambi.eat();
        bambi.run();
    }
}

