package step_3__problems_on_arrays.lec_2_medium;
public class _8_NextPermutation {

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }

    static void printArray(int arr[]){
        System.out.println();
        System.out.println("Array -> ");
        for(int x: arr){
            System.out.print(x+ ", ");
        }
    }

    public static void nextPerm(int arr[]){
        int n = arr.length; // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            reverse(arr, 0, n-1);
            return;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }

        // Step 3: reverse the right half:
        reverse(arr, ind + 1, n-1);
    }

    public static void main(String args[]){
        // int arr[] = {1, 2, 3, 4, 5, 7, 6, 8, 10, 9};
        // int arr[] = {1,3,2};
        int arr[] = {3, 2, 1};
        // int arr[] = {2,1, 5, 4, 3, 0, 0};
        nextPerm(arr);
        printArray(arr);
    }
    
}
