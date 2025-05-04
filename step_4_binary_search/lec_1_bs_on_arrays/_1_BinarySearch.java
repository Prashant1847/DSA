package step_4_binary_search.lec_1_bs_on_arrays;

public class _1_BinarySearch{
    
    private static int BinarySearch_iterative(int arr[], int target){
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target) return mid;
            else if(target > arr[mid]) low = mid + 1;
            else high = mid -1;
        }

        return -1;
    }

    private static int BinarySearch_recursive(int arr[], int low, int high, int target){
        if(low > high) return -1;
        int mid = (low + high) / 2;
        
        if(arr[mid] == target) return mid;
        else if(target > arr[mid]) return  BinarySearch_recursive(arr, mid + 1, high, target);
        return BinarySearch_recursive(arr, low, mid - 1, target);
    }



    public static void main(String args[]){
        int arrr[] = {-1, 10, 20, 30, 40, 50};
        int target = 30;
        System.out.println("index of "+target+" is --> "+BinarySearch_iterative(arrr, target));
        System.out.println("index of "+target+" is --> "+BinarySearch_recursive(arrr, 0, arrr.length -1, target));

    }
}