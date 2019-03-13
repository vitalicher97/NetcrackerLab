// Vitalii Chernetskyi. Data generations

package fillers;

import sorts.*;
import java.util.Random;
import java.lang.annotation.*;

/**
 * 
 * @author Chernetskyi
 * <br><br>
 * Fillers class contains methods for generation of different types of arrays
 * 
 */
public class Fillers{
    
    
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Generator{
        
    }
    
    
    
    
    /**
     * 
     * @param inpLen the size of array to generate
     * @return an array
     * <br><br>
     * Method genRand generates random array
     */
    @Generator
    public static int[] genRand(int inpLen){  
        int[] dataRand = new int[inpLen];  
        dataRand = random(inpLen);
        return dataRand;
    }
    
    /**
     * 
     * @param inpLen the size of array to generate
     * @return an array
     * <br><br>
     * Method genSort generates array with random values and then sorts it
     */
    @Generator
    public static int[] genSort(int inpLen){  
        int[] dataSort = new int[inpLen];  
        dataSort = random(inpLen);
        UsualSort ussort = new UsualSort();
        ussort.usualSort(dataSort);
        return dataSort;
    }
    
    /**
     * 
     * @param inpLen the size of array to generate
     * @return an array
     * <br><br>
     * Method genSortX generates array with random values and then sorts it and
     * than adds random value in the end of array
     */
    @Generator
    public static int[] genSortX(int inpLen){  
        int[] dataSortX = new int[inpLen]; 
        dataSortX = random(inpLen);
        UsualSort ussort = new UsualSort();
        ussort.usualSort(dataSortX);
        dataSortX[dataSortX.length-1] = randomX();
        return dataSortX;
    }
    
    /**
     * 
     * @param inpLen the size of array to generate
     * @return an array
     * <br><br>
     * Method genSortD generates array with descending sorted elements
     */
    @Generator
    public static int[] genSortD(int inpLen){
        int[] dataSortD = new int[inpLen];
        int[] dataTemp = new int[inpLen];
        dataTemp = random(inpLen);
        UsualSort ussort = new UsualSort();
        ussort.usualSort(dataTemp);
        int j = dataTemp.length - 1;
        for(int i = 0; i < dataTemp.length; i++){
            dataSortD[i] = dataTemp[j];
            j = j - 1;
        }
        return dataSortD;
    }
    
    /**
     * 
     * @param inpLen the number of random values to generate
     * @return array of random values
     * <br><br>
     */
    private static int[] random(int inpLen){
        return new Random().ints(inpLen, 0, 101).toArray();
    }
    
    /**
     * 
     * @return one random value
     */
    private static int randomX(){
        int[] tempArr = new int[1];
        tempArr = new Random().ints(1, 0, 101).toArray();
        return tempArr[0];
    }
}