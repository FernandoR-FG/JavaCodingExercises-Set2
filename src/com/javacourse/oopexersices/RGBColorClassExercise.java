package com.javacourse.oopexersices;
//RGBColor class representing a color using Red Green Blue (RGB) model.
class RGBColor {
 
 // The Red, Green, Blue color values range from 0 to 255.
 private int red;
 private int green;
 private int blue;

 // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
 public RGBColor(int red, int green, int blue) {
     // write your code here
     this.red = red;
     this.green = green;
     this.blue = blue;
     
 }

 // Getter method to get the red value of the color.
 public int getRed() {
     // write your code here
     return this.red;
 }

 // Getter method to get the green value of the color.
 public int getGreen() {
     // write your code here
     return this.green;
 }

 // Getter method to get the blue value of the color.
 public int getBlue() {
     // write your code here
     return this.blue;
 }

 // Method to invert the color. The inversion is done by subtracting each color component from 255.
 public void invert() {
     // write your code here
     this.red = 255 - this.red;
     this.blue = 255 - this.blue;
     this.green = 255 - this.green;
 }
}
public class RGBColorClassExercise {

	public static void main(String[] args) {
        // Crear un objeto RGBColor con valores iniciales
        RGBColor color1 = new RGBColor(100, 150, 200);

        // Obtener los valores de los componentes de color
        int red = color1.getRed();
        int green = color1.getGreen();
        int blue = color1.getBlue();
        System.out.println("Componentes de color - Rojo: " + red + ", Verde: " + green + ", Azul: " + blue);

        // Invertir el color y mostrar los nuevos valores
        color1.invert();
        System.out.println("Color invertido - Rojo: " + color1.getRed() + ", Verde: " + color1.getGreen() + ", Azul: " + color1.getBlue());
    }

}
