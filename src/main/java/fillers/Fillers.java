// Vitalii Chernetskyi. Data generations

package fillers;

import sorts.*;
import java.util.Random;
import java.lang.annotation.*;

public class Fillers{
    
    
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Generator{
        
    }
    
    
    
    
    // For random fill
    @Generator
    public static int[] genRand(int inpLen){  
        int[] dataRand = new int[inpLen];  
        dataRand = random(inpLen);
        return dataRand;
    }
    
    // For sorted random fill
    @Generator
    public static int[] genSort(int inpLen){  
        int[] dataSort = new int[inpLen];  
        dataSort = random(inpLen);
        UsualSort ussort = new UsualSort();
        ussort.usualSort(dataSort);
        return dataSort;
    }
    
    // For sorted rand fill with last rand val
    @Generator
    public static int[] genSortX(int inpLen){  
        int[] dataSortX = new int[inpLen]; 
        dataSortX = random(inpLen);
        UsualSort ussort = new UsualSort();
        ussort.usualSort(dataSortX);
        dataSortX[dataSortX.length-1] = randomX();
        return dataSortX;
    }
    
    // For descending sorted rand fill
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
    
    private static int[] random(int inpLen){
        return new Random().ints(inpLen, 0, 101).toArray();
    }
    
    private static int randomX(){
        int[] tempArr = new int[1];
        tempArr = new Random().ints(1, 0, 101).toArray();
        return tempArr[0];
    }
}