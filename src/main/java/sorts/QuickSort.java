
package sorts;

/**
 * 
 * @author Chernetskyi
 * <br><br>
 * QuickSort class performs sorting using quicksort sort method
 */
public class QuickSort extends AbstractSorter {
    /**
     * 
     * @param arr array to be sorted
     * @param low for defining element that is smaller than pivot
     * @param high for defining element that is greater than pivot
     * @return pivot
     * <br><br>
     * partition method takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot
     */
    private int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);  // index of smaller element
        for(int j = low; j < high; j++){
            // If current element is smaller than or
            // equal to pivot
            if(arr[j] <= pivot){
                i++;
                
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    
    
    /**
     * 
     * @param arr array to be sorted
     * @param low initial element that is smaller than pivot (should be 0)
     * @param high initial element that greater than pivot (should be the last
     * element of an array)
     * <br><br>
     * quicksort method is the main function that implements QuickSort() <br>
     * arr[] --> Array to be sorted, <br>
     * low  --> Starting index, <br>
     * high  --> Ending index <br>
     */
    private void quicksort(int arr[], int low, int high){
        
        if(low < high){
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high);
            
            // Recursively sort elements before 
            // partition and after partition
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
            int test = 0;
        }
    }
    
    /**
     * 
     * @param arr array to be sorted
     * <br><br>
     * prepForQuicksort method calls quicksort method and send additional values
     * nedded for quicksort sorting method
     */
    public void prepForQuicksort(int arr[]){
        quicksort(arr, 0, arr.length-1);
    }
}
