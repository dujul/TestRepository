/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorrechnung;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j.duong
 */
public class VektorTest {
    
    public VektorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of plus method, of class Vektor.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vektor that = new Vektor(5,3,10);
        Vektor instance = new Vektor(5,1,7);
        Vektor expResult = new Vektor(10.0,4.0,17.0);
        Vektor result = instance.plus(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of minus method, of class Vektor.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vektor that = new Vektor(6,5,2);
        Vektor instance = new Vektor(3,9,5);
        Vektor expResult = new Vektor(-3.0,4.0,3.0);
        Vektor result = instance.minus(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of skalar method, of class Vektor.
     */
    @Test
    public void testSkalar() {
        System.out.println("skalar");
        Vektor that = new Vektor(2,1,0);
        Vektor instance = new Vektor(1,-2,5);
        double expResult = 0.0;
        double result = instance.skalar(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of kreuz method, of class Vektor.
     */
    @Test
    public void testKreuz() {
        System.out.println("kreuz");
        Vektor that = new Vektor(1,2,3);
        Vektor instance = new Vektor(4,5,6);
        Vektor expResult = new Vektor(3.0,-6.0,3.0);
        Vektor result = instance.kreuz(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of quersumme method, of class Vektor.
     */
    @Test
    public void testQuersumme() {
        System.out.println("quersumme");
        Vektor instance = new Vektor(2,-1,-1);
        double expResult = 0.0;
        double result = instance.quersumme();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class Vektor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vektor instance = new Vektor(8,5,4);
        String expResult = "(8.0,5.0,4.0)";
        String result = instance.toString();
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
