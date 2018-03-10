/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2B;

/**
 *
 * @author Alvaro Moran Fernandez
 */
public class Square extends Shape {
        public Square(double size) {
        super(size);
    }
        @Override
    public double area() {
        double size = getSize() ;
        return size*size;
    }
}
