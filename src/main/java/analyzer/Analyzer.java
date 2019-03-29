// Vitalii Chernetskyi. Analyzer

package analyzer;

import output.ExcelOutput;
import output.*;
import reflect.*;
import sorts.*;
import fillers.*;
import java.io.IOException;
import java.util.*;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * 
 * @author Chernetskyi
 * <br><br>
 * Analyzer class contains methods for defining current time, to calculate duration
 * and to recieve generated arrays and pushing them to sort methods
 */
public class Analyzer {
    
    Output print = new Output();
    ExcelOutput excel = new ExcelOutput();
    
    /**
     * 
     * @return current time in nanoseconds
     */
    public long time(){  
        return System.nanoTime();
    }
    
    /**
     * 
     * @param start is initial time
     * @param end is finish time
     * @return difference between finish and initial time
     */
    public long duration(long start, long end){
        long duration = end - start;
        return duration;
    }
    
    /**
     * 
     * @param inpLen is the maximum array size
     * <br><br>
     * Analyze method calls findGenMethods, findSortClasses and findDeclPublMethod
     * methods to recieve generated arrays and to sort them
     */
    public void analyze(int inpLen) throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, IOException{
        Reflection refl = new Reflection();
        Fillers fill = new Fillers();
        ExcelOutput excel = new ExcelOutput();
        int[] arrGen;
        Method[] sortMets;
        long startTime, endTime;
        long duration;
        Set<Method> annotMets = refl.findGenMethods();
        Set<Class<? extends AbstractSorter>> sortClasses;
        sortClasses = refl.findSortClasses();
        for(Method genMet : annotMets){
            Table<Integer, String, Number> resTable = HashBasedTable.create();
            
            for(int i = 1; i <= inpLen; i = i + 1){
                for(Class sortClass : sortClasses){
                    sortMets = refl.findDeclPublMethod(sortClass);
                    Object sort = sortClass.newInstance();
                    for(Method sortMet : sortMets){
                        arrGen = (int[]) genMet.invoke(fill, i);
                        startTime = time();
                        sortMet.invoke(sort, arrGen);
                        endTime = time();
                        duration = duration(startTime, endTime);
                        //print.printRes(genMet.getName(), i, sortMet.getName(), duration);
                        resTable.put(i, sortMet.getName(), duration);
                    }
                }
            }
            excel.excelOutput("Sorting.xls", genMet.getName(), resTable);
            resTable.clear();
        }
    }
    
}
