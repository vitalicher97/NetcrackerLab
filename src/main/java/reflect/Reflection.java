
package reflect;

import sorts.*;
import org.reflections.*;
import java.util.*;
import java.lang.reflect.*;
import org.reflections.scanners.MethodAnnotationsScanner;


public class Reflection {
    
    public Set<Class<? extends AbstractSorter>> findSortClasses(){
        Reflections reflections = new Reflections("sorts");
        Set<Class<? extends AbstractSorter>> classes;
        classes = reflections.getSubTypesOf(sorts.AbstractSorter.class);
        Iterator iterator = classes.iterator();
        while(iterator.hasNext()){
            Class element = (Class) iterator.next();
            if(Modifier.isAbstract(element.getModifiers()) == true){
               iterator.remove();
            }
        }
        return classes;
    }
    
    public Method[] findDeclPublMethod(Class contain){
        Method[] declMets;
        ArrayList<Method> decPublMets = new ArrayList<Method>();
        declMets = contain.getDeclaredMethods();
        for(Method method : declMets){
            if(Modifier.isPublic(method.getModifiers())){
                decPublMets.add(method);
            }
        }
        return decPublMets.toArray(new Method[0]);
    }
    
    public Set<Method> findGenMethods(){
        Reflections reflections = new Reflections("fillers", new MethodAnnotationsScanner());
        Set<Method> annotMet = reflections.getMethodsAnnotatedWith(fillers.Fillers.Generator.class);
        return annotMet;
    }
        
    
    
}
