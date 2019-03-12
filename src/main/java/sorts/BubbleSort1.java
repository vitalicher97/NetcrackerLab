
package sorts;


public class BubbleSort1 extends BubbleSorter{
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
