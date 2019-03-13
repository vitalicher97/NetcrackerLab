
package sorts;

import java.util.Arrays;

/**
 * 
 * @author Chernetskyi
 * <br><br>
 * MergeSort class contains methods needed for performing different types of
 * merge sorting
 */
public class MergeSort extends AbstractSorter{
    /**
     * 
     * @param arr array to be sorted
     * @param handle string name that defines which additional sort type will be
     * used for intermidiate sortings
     * <br><br>
     * mergeSort method performs sorting using merge type sort
     */
    private void mergeSort(int arr[], String handle){
        
        int len = arr.length;
        int[] sortedArr = new int[len];
        
        // Dividing array by 2 on two arrays
        int[] arr1 = Arrays.copyOfRange(arr, 0, len/2);
        int[] arr2 = Arrays.copyOfRange(arr, len/2, len);
        
        BubbleSort1 bubsor1 = new BubbleSort1();
        BubbleSort2 bubsor2 = new BubbleSort2();
        QuickSort quicksor = new QuickSort();
        UsualSort ussort = new UsualSort();
        
        if(handle == "BubbleSort1"){
            bubsor1.bubbleSort1(arr1);
            bubsor1.bubbleSort1(arr2);
        }
        else if(handle == "BubbleSort2"){
            bubsor2.bubbleSort2(arr1);
            bubsor2.bubbleSort2(arr2);
        }
        else if(handle == "QuickSort"){
            quicksor.prepForQuicksort(arr1);
            quicksor.prepForQuicksort(arr2);
        }
        else if(handle == "UsualSort"){
            ussort.usualSort(arr1);
            ussort.usualSort(arr2);
        }
        else {
            System.out.print("You should choose BubbleSort1, BubbleSort2, "
                    + "UsusalSort or QuickSort method.\n");
            System.exit(0);
        }
        
        // Merge sort of two sorted arrays
        int i = 0;
        int j = 0;
        for(int k = 0; k < sortedArr.length; k++){
            if(i > arr1.length-1){
                int temp = arr2[j];
                sortedArr[k] = temp;
                j++;
            }
            else if(j > arr2.length-1){
                int temp = arr1[i];
                sortedArr[k] = temp;
                i++;
            }
            else if(arr1[i] < arr2[j]){
                int temp = arr1[i];
                sortedArr[k] = temp;
                i++;
            }
            else {
                int temp2 = arr2[j];
                sortedArr[k] = temp2;
                j++;
            }
        }
        
        
    }
    
    /**
     * 
     * @param arr array to be sorted
     * <br><br>
     * mergeViaBubbleSort1 method calls {@link sorts.MergeSort#mergeSort(int[], java.lang.String) }
     * method and declare which
     * additional sort type to use for intermidiate sortings
     * @see sorts.BubbleSort1#bubbleSort1(int[]) 
     */
    public void mergeViaBubbleSort1(int arr[]){
        mergeSort(arr, "BubbleSort1");
    }
    /**
     * 
     * @param arr array to be sorted
     * <br><br>
     * mergeViaBubbleSort2 method calls {@link sorts.MergeSort#mergeSort(int[], java.lang.String) }
     * method and declare which
     * additional sort type to use for intermidiate sortings
     * @see sorts.BubbleSort2#bubbleSort2(int[]) 
     */
    public void mergeViaBubbleSort2(int arr[]){
        mergeSort(arr, "BubbleSort2");
    }
    /**
     * 
     * @param arr array to be sorted
     * <br><br>
     * mergeViaQuickSort method calls {@link sorts.MergeSort#mergeSort(int[], java.lang.String) }
     * method and declare which
     * additional sort type to use for intermidiate sortings
     * @see sorts.QuickSort#prepForQuicksort(int[]) 
     */
    public void mergeViaQuickSort(int arr[]){
        mergeSort(arr, "QuickSort");
    }
    /**
     * 
     * @param arr array to be sorted
     * <br><br>
     * mergeViaUsualSort method calls {@link sorts.MergeSort#mergeSort(int[], java.lang.String) }
     * method and declare which
     * additional sort type to use for intermidiate sortings
     * @see sorts.UsualSort#usualSort(int[]) 
     */
    public void mergeViaUsualSort(int arr[]){
        mergeSort(arr, "UsualSort");
    }
}
