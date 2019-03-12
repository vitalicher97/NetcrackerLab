
package sorts;

import java.util.Arrays;


public class MergeSort extends AbstractSorter{
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
    
    
    public void mergeViaBubbleSort1(int arr[]){
        mergeSort(arr, "BubbleSort1");
    }
    
    public void mergeViaBubbleSort2(int arr[]){
        mergeSort(arr, "BubbleSort2");
    }
    
    public void mergeViaQuickSort(int arr[]){
        mergeSort(arr, "QuickSort");
    }
    
    public void mergeViaUsualSort(int arr[]){
        mergeSort(arr, "UsualSort");
    }
}
