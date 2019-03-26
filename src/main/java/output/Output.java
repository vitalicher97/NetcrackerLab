// Vitalii Chernetskyi. Output

package output;


/**
 * 
 * @author Chernetskyi
 * <br><br>
 * Output class contains method for printing results
 */
public class Output {
    
    /**
     * 
     * @param duration time to print
     * @param nameSort the name of sort type
     */
    public void printRes(long duration, String nameSort, String nameFill, int size){
        
        System.out.println(nameFill + " " + size + " elements\n" + nameSort);
        System.out.print(duration + " ns\n\n");
        
    }
    
}
