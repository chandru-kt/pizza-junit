/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.junit.Assert.assertArrayEquals;
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
public class QuickSortNGTest {
    
    public QuickSortNGTest() {
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
     * Test of sort method, of class QuickSort.
     */
    @Test
    public void testSort() {
    int[] data = { 5, 2, 4, 6, 1, 3 };
    QuickSort instance = new QuickSort();
    instance.sort(data, 0, data.length - 1);
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, data);
    }

   
    @Test
    public void testSwap() {
        int[] dataSwap = { 5, 2, 4, 6, 1, 3 };
        int idx1 = 1;
        int idx2 = 4;
        QuickSort instance = new QuickSort();
        instance.swap(dataSwap, idx1, idx2);
        assertArrayEquals(new int[] { 5, 1, 4, 6, 2, 3 }, dataSwap);
    }
    
}
