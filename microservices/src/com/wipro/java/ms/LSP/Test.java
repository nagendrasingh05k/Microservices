package com.wipro.java.ms.LSP;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

public class Test {
	
	static void getAreaTest(Shape shape) {
        System.out.println("Expected area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        getAreaTest(rectangle);

        Shape square = new Square(5);
        getAreaTest(square);
    }

}
