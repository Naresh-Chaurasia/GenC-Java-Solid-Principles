package com.example.solid;

/**
 * Liskov Substitution Principle (LSP)
 * 
 * The Liskov Substitution Principle states that objects of a superclass 
 * should be replaceable with objects of a subclass without affecting 
 * the correctness of the program. This principle is about ensuring 
 * that a derived class can stand in for its base class.
 * 
 * This class demonstrates the Liskov Substitution Principle by providing 
 * an example of a base class and a derived class that adheres to this principle.
 */

// Base class
class Bird {
    public void fly() {
        System.out.println("I can fly!");
    }
}

// Derived class
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying!");
    }
}

// Another derived class
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly.");
    }
}

// Demonstration of Liskov Substitution Principle
public class LiskovSubstitution {

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        makeBirdFly(sparrow); // This works fine

        Bird ostrich = new Ostrich();
        try {
            makeBirdFly(ostrich); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}