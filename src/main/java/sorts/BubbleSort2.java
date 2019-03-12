
package sorts;


public class BubbleSort2 extends BubbleSorter{
    // Ascending sorting, but from array's end
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
