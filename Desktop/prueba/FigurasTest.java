/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnicas;

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
public class CuadradoTest {
    
    public CuadradoTest() {
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
     * Test of Perimetro method, of class Cuadrado.
     */
    @Test 
    public void TestArea()
    {
        double areaEsperada,area;
        areaEsperada=100;
        area=Cuadrado.Area(100,100,100,100);
         assertEquals(areaEsperada,area,0.0);
        
    }
    
    @Test
    public void TestPerimetro()
    {
        double perimetroEsperado,perimetro;
        perimetro=40;
        perimetroEsperado=Cuadrado.Perimetro(10, 10, 10,10);
        assertEquals(perimetroEsperado,perimetro,0.0);
        
    }
}
