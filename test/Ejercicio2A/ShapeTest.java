package Ejercicio2A;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro Moran
 */
public class ShapeTest {
    
    public ShapeTest() {
    }
    /**
     * Test of area method, of class Shape.
     */
    @Test
    public void testAreaSquareTrue() {
        System.out.println("area square");
        Shape instance = new Shape(1,5.0);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testAreaSquareFalse() {
        System.out.println("area square");
        Shape instance = new Shape(1,4.0);
        double expResult = 25.0;
        double result = instance.area();
        boolean estaBien= expResult==result;
        assertFalse(estaBien);

    }
    @Test
    public void testAreaCircleTrue() {
        System.out.println("area circle");
        Shape instance = new Shape(2,4.0);
        double expResult = 12.566370614359172;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testAreaCircleFalse() {
        System.out.println("area circle");
        Shape instance = new Shape(2,3.00);
        double expResult = 12.566370614359172;
        double result = instance.area();
        boolean estaBien= expResult==result;
        assertFalse(estaBien);

    }
    @Test
    public void testAreaTriangleTrue() {
        System.out.println("area triangle");
        Shape instance = new Shape(3,10.0);
        double expResult = 50.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testAreaTriangleFalse() {
        System.out.println("area triangle");
        Shape instance = new Shape(3,12.0);
        double expResult = 50.0;
        double result = instance.area();
        boolean estaBien= expResult==result;
        assertFalse(estaBien);

    }
    
}
