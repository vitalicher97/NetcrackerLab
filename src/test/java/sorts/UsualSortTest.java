
package sorts;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import fillers.*;


public class UsualSortTest {
    
    int[] array;
    int[] arraySorted;
    UsualSort ussort = new UsualSort();
    Fillers fill = new Fillers();
    
    @Before
    public void generateArr() {
        array = fill.genRand(100);
    }

    @Test(timeout=1000)
    public void testUsualSortTimeout() {
        System.out.println("UsualSort");
        ussort.usualSort(array);
    }
    
    @Test
    public void testUsualSortCorrect() {
        System.out.println("UsualSort");
        int[] arrayInit = {3, 2, 1, 0, 4};
        int[] arrayRes = {0, 1, 2, 3, 4};
        ussort.usualSort(arrayInit);
        assertArrayEquals("Sorting doesn't correct", arrayRes, arrayInit);
    }
}
