package Ejercicio2B;

/**
 *
 * @author Alvaro Moran Fernandez
 */
public abstract class Shape {
    private final double size;
    public Shape(double size) 
    {
        this.size = size;
    }
    public double getSize() 
    { 
        return size; 
    }
    public abstract double area();

}
