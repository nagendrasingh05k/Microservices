package com.wipro.java.ms.ISP;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printing document...");
    }
}

class MultiFunctionPrinter implements Printer, Scanner, FaxMachine {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public void fax() {
        System.out.println("Faxing document...");
    }
}