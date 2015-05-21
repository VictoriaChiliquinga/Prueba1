/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBase method, of class Rectangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Rectangulo instance = null;
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Rectangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Rectangulo instance = null;
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Rectangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Rectangulo instance = null;
        double expResult = 0.0;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Rectangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        double altura = 0.0;
        Rectangulo instance = null;
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaRectangulo method, of class Rectangulo.
     */
    @Test
    public void testGetAreaRectangulo() {
        System.out.println("getAreaRectangulo");
        Rectangulo instance = null;
        double expResult = 0.0;
        double result = instance.getAreaRectangulo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Rectangulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangulo instance = null;
        instance.area();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
