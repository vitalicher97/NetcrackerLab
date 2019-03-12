
package sorts;

/**
 * 
 * @author Chernetskyi
 * 
 * BubbleSort2 class contains method for sorting by bubblesort method but
 * in descending type (not order, array will be sorted in ascending mode)
 */
public class BubbleSort2 extends BubbleSorter{
    /**
     * 
     * @param arr array that be sorted
     * <br><br>
     * bubbleSort2 method performs ascending sorting, but from array's end,
     * by bubble type
     */
    public void bubbleSort2(int arr[]){
        boolean check = false;
        int temp;
        int len = arr.length;
        
        // The body of sorting
        do {
            check = false;
            for(int i = len-1; i > 0; i--){  // Loop from array's end to begin
                if(arr[i] < arr[i-1]){
                    check = true;
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        } while(check);
        
        
    }
}
