import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {
	
	
        
    @Test
    public void testSortvalid() {
    int[] data = { 5, 2, 4, 6, 1, 3 };
    QuickSort instance = new QuickSort();
    instance.sort(data, 0, data.length - 1);
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, data);
    }
    
    @Test
    public void testSortinvalid() {
    int[] data = { 5, 2, 4, 6, 1, 3 };
    QuickSort instance = new QuickSort();
    instance.sort(data, 0, data.length - 1);
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 8 }, data);
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
