// Vitalii Chernetskyi. Output

package output;


/**
 * 
 * @author Chernetskyi
 * 
 * Output class contains method for printing results
 */
public class Output {
    
    /**
     * 
     * @param duration time to print
     * @param nameSort the name of sort type
     */
    public void printRes(long duration, String nameSort){
        
        System.out.println(nameSort);
        System.out.print(duration + " ns\n\n");
        
    }
    
}
