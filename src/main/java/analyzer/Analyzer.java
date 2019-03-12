// Vitalii Chernetskyi. Analyzer

package analyzer;

import output.*;
import reflect.*;
import sorts.*;
import fillers.*;
import java.util.*;
import java.lang.reflect.*;

public class Analyzer {
    
    Output print = new Output();
    
    public long time(){  
        return System.nanoTime();
    }
    
    public long duration(long start, long end){
        long duration = end - start;
        return duration;
    }
    
    public void analyze(int inpLen) throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException{
        Reflection refl = new Reflection();
        Fillers fill = new Fillers();
        int[] arrGen;
        Method[] sortMets;
        long startTime, endTime;
        long duration;
        //ArrayList<Number> durationList = new ArrayList<Number>();
        Set<Method> annotMets = refl.findGenMethods();
        Set<Class<? extends AbstractSorter>> sortClasses;
        sortClasses = refl.findSortClasses();
        for(int i = 1; i <= inpLen; i = i + 1){
            for(Class sortClass : sortClasses){
                sortMets = refl.findDeclPublMethod(sortClass);
                Object sort = sortClass.newInstance();
                for(Method sortMet : sortMets){
                    for(Method genMet : annotMets){
                        arrGen = (int[]) genMet.invoke(fill, i);
                        startTime = time();
                        sortMet.invoke(sort, arrGen);
                        endTime = time();
                        duration = duration(startTime, endTime);
                        //durationList.add(duration);
                        //print.printRes(duration, sortMet.getName());
                    }
                }
            }
        }
    }
    
}
