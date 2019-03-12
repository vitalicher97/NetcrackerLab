
package sorts;

/**
 * 
 * @author Chernetskyi
 * 
 * BubbleSort1 class contains method for sorting by bubblesort method
 */
public class BubbleSort1 extends BubbleSorter{
    /**
     * 
     * @param arr array for sorting
     * <br><br>
     * bubbleSort1 method sorts array using bubble sort type
     */
    public void bubbleSort1(int arr[]){
        boolean check = false;  // Flag for checking if any changes in sort loop
        int temp;
        int len = arr.length;
        
        // The body of sorting
        do {
            check = false;
            for(int i = 0; i < len-1; i++){  // Loop for sorting
                if(arr[i] > arr[i+1]){
                    check = true;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        } while(check);
        
        
        
    }
}
