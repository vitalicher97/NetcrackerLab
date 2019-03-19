
package analyzer;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chernetskyi
 */
public class AnalyzerTest {

    @Test(timeout=10)
    public void testTime() {
        System.out.println("time");
        Analyzer instance = new Analyzer();
        long result = instance.time();
        assertNotNull("Returned time is null!", result);
    }

    @Test(timeout=100)
    public void testDuration() {
        System.out.println("duration");
        long start = 10L;
        long end = 25L;
        Analyzer instance = new Analyzer();
        long expResult = 15L;
        long result = instance.duration(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(timeout=600000)
    public void testAnalyze() throws Exception {
        System.out.println("analyze");
        int inpLen = 100;
        Analyzer instance = new Analyzer();
        instance.analyze(inpLen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
