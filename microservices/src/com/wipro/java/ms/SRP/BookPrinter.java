package com.wipro.java.ms.SRP;

public class BookPrinter {

	public void printBookDetails(Book book) {
        System.out.println("Book: " + book.getName());
        System.out.println("Author: " + book.getAuthorName());
        System.out.println("Year: " + book.getYear());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("ISBN: " + book.getIsbn());
    }
}
