package com.example.solid;

// Interface for Printer
interface Printer {
    void printDocument(String document);
}

// Interface for Scanner
interface Scanner {
    void scanDocument(String document);
}

// MultiFunctionPrinter implements both Printer and Scanner interfaces
class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }
}

// SimplePrinter implements only Printer interface
class SimplePrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}

// Client code to demonstrate Interface Segregation Principle
public class InterfaceSegregation {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.printDocument("MyDocument.txt");

        Scanner scanner = new MultiFunctionPrinter();
        scanner.scanDocument("MyDocument.txt");
    }
}