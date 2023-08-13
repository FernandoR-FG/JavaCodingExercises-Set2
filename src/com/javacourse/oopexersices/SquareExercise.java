package com.javacourse.oopexersices;
class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if(side < 1)
            return -1;
        return this.side * this.side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if(side < 1)
            return -1;
        return 4*this.side;
    }

}
public class SquareExercise {

	public static void main(String[] args) {
		Square a = new Square(8);
		System.out.println(a.calculateArea());
	}

}
