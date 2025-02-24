package com.wipro.java.ms.OCP;

interface Books{
    void setTitle(String title);
    void setAuthor(String author);
    void display();
}

class ArtBook implements Books{
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("type1 Book - Title: " + title + ", Author: " + author);
    }
}

class BussinesBook implements Books{
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("type2 Book - Title: " + title + ", Author: " + author);
    }
}

public class BookStore {

	public static void main(String[] args) {
        
		
        Books type1 = new ArtBook();
        type1.setTitle("The Creative Act");
        type1.setAuthor("Adam Moss");
        type1.display();

        Books type2 = new BussinesBook();
        type2.setTitle("Give and Take");
        type2.setAuthor("Adam Grant");
        type2.display();
    }
}
