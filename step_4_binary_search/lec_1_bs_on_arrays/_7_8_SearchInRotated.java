package step_4_binary_search.lec_1_bs_on_arrays;

public class _7_8_SearchInRotated {
    
    private static int searchInRotated_mysolution(int arr[], int target){
        int low = 1, n = arr.length;
        while(arr[low - 1] < arr[low]) low++;

        int high = (n - 1) + low; //hypothetical low


        while(low <= high){
            int mid = (low + high) / 2;
            int adjustedMid = ((low + high) / 2) % n;

            if(arr[adjustedMid] == target) return adjustedMid;
            else if(target > arr[adjustedMid]) low = mid + 1;
            else high = mid -1;
        }

        return -1;
    }

    private static int searchInRotated(int arr[], int target){
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target) return  mid;

            //if condition when duplicate element in array [3, 1, 3 ,3, 3]
            if((arr[mid] == arr[low]) && arr[mid] == arr[high]){
                high --;
                low++;
                continue;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= target  && target <= arr[mid]) high = mid -1;
                else low = mid + 1;
            }else{
                if(arr[mid] <= target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;

            }
        }
        return -1;
    }




    public static void main(String args[]){
        // int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int arr[] = {1, 0, 1, 1, 1};
                   //0, 1, 2, 3, 4, 5, 6, 7, 8
        int target = 0;

        System.out.println("Element is present on index --> "+ searchInRotated_mysolution(arr, target));
        System.out.println("Element is present on index --> "+ searchInRotated(arr, target));
    }
    
}
