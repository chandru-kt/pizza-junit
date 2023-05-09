/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author chandru kt
 */
public class PizzaStackNGTest {
    
    public PizzaStackNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of isEmpty method, of class PizzaStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PizzaStack instance = new PizzaStack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PizzaStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PizzaStack instance = new PizzaStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class PizzaStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Pizza o = null;
        PizzaStack instance = new PizzaStack();
        instance.push(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class PizzaStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PizzaStack instance = new PizzaStack();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PizzaStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PizzaStack instance = new PizzaStack();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PizzaStack.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        PizzaStack instance = new PizzaStack();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
