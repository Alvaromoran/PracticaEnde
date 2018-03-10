package Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro Moran Fernandez
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo 1");
        int n = 5;
        int expResult = 120;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
    }
    @Test(expected= IllegalArgumentException.class ) //Para probar la excepcion de un numero negativo
        public void testCalculo2() {
        int n = -1;
        System.out.println("calculo 2, Número " + n + " no puede ser < 0");
        int result = Factorial.calculo(n);
    }
    @Test(expected=ArithmeticException.class )  //Para probar la excepcion de un factorial muy grande
        public void testCalculo3() {
        int n = 32;
        System.out.println("calculo 3 Overflow, número " + n + " demasiado grande");
        int result = Factorial.calculo(n);

    }
    
}
