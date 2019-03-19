
package fillers;

import org.junit.Test;
import static org.junit.Assert.*;


public class FillersTest {
    

    @Test(timeout=100)
    public void testGenRand() {
        System.out.println("genRand");
        int inpLen = 5;
        int[] result = Fillers.genRand(inpLen);
        assertNotNull("Generated array must not be null", result);
    }
    
    @Test(expected = NegativeArraySizeException.class)
    public void testGenRandException() {
        System.out.println("genRand");
        int[] result = Fillers.genRand(-5);
    }

    @Test(timeout=100)
    public void testGenSort() {
        System.out.println("genSort");
        int inpLen = 5;
        int[] result = Fillers.genSort(inpLen);
        assertNotNull("Generated array must not be null", result);
    }
    
    @Test(expected = NegativeArraySizeException.class)
    public void testGenSortException() {
        System.out.println("genSort");
        int[] result = Fillers.genSort(-5);
    }

    @Test(timeout=100)
    public void testGenSortX() {
        System.out.println("genSortX");
        int inpLen = 5;
        int[] result = Fillers.genSortX(inpLen);
        assertNotNull("Generated array must not be null", result);
    }
    
    @Test(expected = NegativeArraySizeException.class)
    public void testGenSortXException() {
        System.out.println("genSortX");
        int[] result = Fillers.genSortX(-5);
    }

    @Test(timeout=100)
    public void testGenSortD() {
        System.out.println("genSortD");
        int inpLen = 5;
        int[] result = Fillers.genSortD(inpLen);
        assertNotNull("Generated array must not be null", result);
    }
    
    @Test(expected = NegativeArraySizeException.class)
    public void testGenSortDException() {
        System.out.println("genSortD");
        int[] result = Fillers.genSortD(-5);
    }
    
}
