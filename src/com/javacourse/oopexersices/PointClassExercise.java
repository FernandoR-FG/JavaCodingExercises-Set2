package com.javacourse.oopexersices;
//Defining a Point class to represent a point in 2-dimensional space
class Point {
 
 // x-coordinate of the point
 private int x;

 // y-coordinate of the point
 private int y;

 // Constructor for the Point class
 public Point(int x, int y) {
     this.x = x;  // Assigning x-coordinate of the point
     this.y = y;  // Assigning y-coordinate of the point
 }

 // Method to get the x-coordinate of the point
 public int getX() {
     return this.x;
 }

 // Method to get the y-coordinate of the point
 public int getY() {
     return this.y;
 }

 // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
 public void move(int dx, int dy) {
     // Your code here
     this.x += dx;
     this.y += dy;
 }

 // TODO: Implement the method to calculate the distance from this point to another point
 public double distanceTo(Point other) {
     double deltaX = other.getX() - this.x;
     double deltaY = other.getY() - this.y;
     return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
     // Your code here
 }
}
public class PointClassExercise {

	public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);
        
        double distance = point1.distanceTo(point2);
        System.out.println("Distancia: " + distance);

        point1.move(1, 2);
        System.out.println("Coordenadas despues del movimiento: (" + point1.getX() + ", " + point1.getY() + ")");
    }

}
