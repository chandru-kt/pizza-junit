/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chandru kt
 */
public class PizzaStackTest {
    
    public PizzaStackTest() {
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
     * Test of equals method, of class PizzaStack.
     */
    
    @Test
    public void testIsEmptyTrue() {
        PizzaStack instance = new PizzaStack();
        boolean result = instance.isEmpty();
        assertTrue(result);
    }
    
    @Test
    public void testIsEmptyFalse() {
        PizzaStack instance = new PizzaStack();
        Pizza p = new Pizza();
        instance.push(p);
        boolean result = instance.isEmpty();
        assertFalse(result);
    }
    
    @Test
    public void testSize() {
    PizzaStack instance = new PizzaStack();
    int expectedSize = 0;
    int actualSize = instance.size();
    assertEquals(expectedSize, actualSize);
}
   
    
    
@Test
public void testPushinvalid() {
    System.out.println("push");
    Pizza pizza = new Pizza();
    PizzaStack instance = new PizzaStack();
    
    // Valid test case
    instance.push(pizza);
    assertFalse(instance.isEmpty());
    assertEquals(1, instance.size());
    assertEquals(pizza, instance.pop());
    
    // Invalid test case - null object
    instance.push(null);
    assertTrue(instance.isEmpty());
    
    // Invalid test case - exceeding initial capacity
    int numObjects = 200;
    for (int i = 0; i < numObjects; i++) {
        instance.push(new Pizza());
    }
    assertEquals(numObjects, instance.size());
}

    /**
     *
     */
    @Test
public void testPushvalid() {
    PizzaStack stack = new PizzaStack();
    
    // Test pushing to an empty stack
    Pizza pizza1 = new Pizza();
    stack.push(pizza1);
    assertEquals(1, stack.size());
    assertFalse(stack.isEmpty());
    assertEquals(pizza1, stack.pop());
    
    // Test pushing multiple elements
    Pizza pizza2 = new Pizza();
    Pizza pizza3 = new Pizza();
    stack.push(pizza2);
    stack.push(pizza3);
    assertEquals(2, stack.size());
    assertFalse(stack.isEmpty());
    assertEquals(pizza3, stack.pop());
    assertEquals(pizza2, stack.pop());
    
    // Test pushing beyond initial capacity
    for (int i = 0; i < 100; i++) {
        Pizza pizza = new Pizza();
        stack.push(pizza);
    }
    assertEquals(100, stack.size());
    assertFalse(stack.isEmpty());
    
    Pizza pizza101 = new Pizza();
    stack.push(pizza101);
    assertEquals(101, stack.size());
    assertFalse(stack.isEmpty());
    assertEquals(pizza101, stack.pop());
    
    // Test pushing null pizza
    Pizza pizzaNull = null;
    stack.push(pizzaNull);
    assertEquals(101, stack.size()); // Size should not increase
    assertFalse(stack.isEmpty());
}


    
   

// Test with an empty stack
@Test
public void testToStringWithEmptyStack() {
    PizzaStack stack = new PizzaStack();
    assertEquals("", stack.toString());
}
}
