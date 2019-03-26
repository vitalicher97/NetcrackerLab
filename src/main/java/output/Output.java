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
    public void printRes(String nameFill, int size, String nameSort,
            long duration){
        
        System.out.println(nameFill + " " + size + " elements\n" + nameSort + 
                ":\n" + duration + " ns\n\n");
        
    }
    
}
