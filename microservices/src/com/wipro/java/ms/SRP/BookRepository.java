package com.wipro.java.ms.SRP;

public class BookRepository {

	public void save(Book book) {
        System.out.println("Saving book: " + book.getName() + " to database.");
    }
}
