package com.example.solid;

// This file serves as the entry point of the application. It creates instances of the classes demonstrating the SOLID principles and calls their methods.

public class Main {
    public static void main(String[] args) {
        // Demonstrating Single Responsibility Principle
        SingleResponsibility singleResponsibility = new SingleResponsibility();
        singleResponsibility.generateReport();
        singleResponsibility.sendReport("NC");

        // // Demonstrating Open/Closed Principle
        // OpenClosed openClosed = new OpenClosed();
        // openClosed.demonstrateOpenClosed();

        // // Demonstrating Liskov Substitution Principle
        // LiskovSubstitution liskovSubstitution = new LiskovSubstitution();
        // liskovSubstitution.demonstrateSubstitution();

        // // Demonstrating Interface Segregation Principle
        // InterfaceSegregation interfaceSegregation = new InterfaceSegregation();
        // interfaceSegregation.useSpecificInterface();

        // // Demonstrating Dependency Inversion Principle
        // DependencyInversion dependencyInversion = new DependencyInversion();
        // dependencyInversion.execute();
    }
}