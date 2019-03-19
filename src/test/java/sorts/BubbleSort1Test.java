
package sorts;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import fillers.*;


public class BubbleSort1Test {
    
    int[] array;
    int[] arraySorted;
    BubbleSort1 bubblesort1 = new BubbleSort1();
    Fillers fill = new Fillers();
    
    @Before
    public void generateArr() {
        array = fill.genRand(100);
    }

    @Test(timeout=1000)
    public void testBubbleSort1Timeout() {
        System.out.println("bubbleSort1");
        bubblesort1.bubbleSort1(array);
    }
    
    @Test
    public void testBubbleSort1Correct() {
        System.out.println("bubbleSort1");
        int[] arrayInit = {3, 2, 1, 0, 4};
        int[] arrayRes = {0, 1, 2, 3, 4};
        bubblesort1.bubbleSort1(arrayInit);
        assertArrayEquals("Sorting doesn't correct", arrayRes, arrayInit);
    }
}
