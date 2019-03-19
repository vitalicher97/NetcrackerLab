
package sorts;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import fillers.*;


public class BubbleSort2Test {
    
    int[] array;
    int[] arraySorted;
    BubbleSort2 bubblesort2 = new BubbleSort2();
    Fillers fill = new Fillers();
    
    @Before
    public void generateArr() {
        array = fill.genRand(100);
    }

    @Test(timeout=1000)
    public void testBubbleSort2Timeout() {
        System.out.println("bubbleSort2");
        bubblesort2.bubbleSort2(array);
    }
    
    @Test
    public void testBubbleSort2Correct() {
        System.out.println("bubbleSort2");
        int[] arrayInit = {3, 2, 1, 0, 4};
        int[] arrayRes = {0, 1, 2, 3, 4};
        bubblesort2.bubbleSort2(arrayInit);
        assertArrayEquals("Sorting doesn't correct", arrayRes, arrayInit);
    }
}
