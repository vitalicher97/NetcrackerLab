
package sorts;

import org.junit.Test;
import static org.junit.Assert.*;
import fillers.*;
import org.junit.Before;



public class MergeSortTest {
    
    Fillers fill = new Fillers();
    MergeSort instance = new MergeSort();
    int[] arr;
    
    @Before
    public void genRand() {
        arr = fill.genRand(100);
    }

    @Test(timeout=10)
    public void testMergeViaBubbleSort1Timeout() {
        System.out.println("mergeViaBubbleSort1");
        instance.mergeViaBubbleSort1(arr);
    }

    @Test(timeout=10)
    public void testMergeViaBubbleSort2Timeout() {
        System.out.println("mergeViaBubbleSort2");
        instance.mergeViaBubbleSort2(arr);
    }

    @Test(timeout=10)
    public void testMergeViaQuickSortTimeout() {
        System.out.println("mergeViaQuickSort");
        instance.mergeViaQuickSort(arr);
    }

    @Test(timeout=10)
    public void testMergeViaUsualSortTimeout() {
        System.out.println("mergeViaUsualSort");
        instance.mergeViaUsualSort(arr);
    }
    
}
