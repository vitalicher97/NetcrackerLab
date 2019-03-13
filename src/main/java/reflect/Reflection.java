
package reflect;

import sorts.*;
import org.reflections.*;
import java.util.*;
import java.lang.reflect.*;
import org.reflections.scanners.MethodAnnotationsScanner;

/**
 * 
 * @author Chernetskyi
 * <br><br>
 * Reflection class contains methods thad use reflection for its execution
 */
public class Reflection {
    
    /**
     * 
     * @return set of classes
     * <br><br>
     * findSortClasses method finds all classes that inherited from
     * AbstractSorter class, excludind abstract inherited classes
     */
    public Set<Class<? extends AbstractSorter>> findSortClasses(){
        Reflections reflections = new Reflections("sorts");
        Set<Class<? extends AbstractSorter>> classes;
        classes = reflections.getSubTypesOf(sorts.AbstractSorter.class);
        Iterator iterator = classes.iterator();
        while(iterator.hasNext()){
            Class element = (Class) iterator.next();
            if(Modifier.isAbstract(element.getModifiers()) == true){
               iterator.remove();   // removes abstract classes
            }
        }
        return classes;
    }
    
    /**
     * 
     * @param contain the class in which methods will be searched
     * @return an array of found methods
     * <br><br>
     * findDeclPublMethod finds declared public methods in the given class
     */
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
    
    /**
     * 
     * @return set of found methods
     * <br><br>
     * findGenMethods finds methods annotated with Generator in fillers package
     */
    public Set<Method> findGenMethods(){
        Reflections reflections = new Reflections("fillers", new MethodAnnotationsScanner());
        Set<Method> annotMet = reflections.getMethodsAnnotatedWith(fillers.Fillers.Generator.class);
        return annotMet;
    }
        
    
    
}
