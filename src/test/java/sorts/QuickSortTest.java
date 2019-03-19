/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import fillers.Fillers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Vitalii
 */
public class QuickSortTest {
    
    Fillers fill = new Fillers();
    QuickSort instance = new QuickSort();
    int[] arr;
    
    @Before
    public void genRand() {
        arr = fill.genRand(100);
    }

    @Test(timeout=10)
    public void testprepForQuicksortTimeout() {
        System.out.println("prepForQuicksort");
        instance.prepForQuicksort(arr);
    }
    
}
