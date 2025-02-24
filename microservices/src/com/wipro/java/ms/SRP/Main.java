package com.wipro.java.ms.SRP;

public class Main {

	public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988, 499, "978-0061122415");

        BookPrinter printer = new BookPrinter();
        printer.printBookDetails(book);

        BookRepository repository = new BookRepository();
        repository.save(book);
    }
}
