// Vitalii Chernetskyi

package main;


import java.util.Scanner;
import java.lang.reflect.*;
import analyzer.*;

/**
 * 
 * @author Chernetskyi
 */
public class Main {
    
    /**
     * 
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException because of exceptions in analyze method
     * <br><br>
     * Main method provides scanning of the user's input and
     * calls {@link analyze}
     */
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException{
        Analyzer analyzer = new Analyzer();
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter the max length of array. You can write only "
                + "integer values up to 8000:\n");
        if(in.hasNextInt() == false){
            System.out.print("Inputted value must be integer!\n");
            System.exit(0);
        }
        int inpLen = in.nextInt();
        if(inpLen < 1 || inpLen > 8000){
            System.out.print("\nInputted value not allowed.\nThe inputted "
                + "value can't be smaller than 1 and greater than 8000\n");
            System.exit(0);
        }
        
        analyzer.analyze(inpLen);
        
        
        

          
        
        
        
        
        
    }
    
}
