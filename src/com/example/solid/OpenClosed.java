package com.example.solid;

// Interface for shape
interface Shape {
    double area();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// AreaCalculator class that uses the Open/Closed Principle
class AreaCalculator {
    public double totalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}

// Main class to demonstrate the Open/Closed Principle
public class OpenClosed {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Rectangle(4, 6)
        };

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.totalArea(shapes));
    }
}