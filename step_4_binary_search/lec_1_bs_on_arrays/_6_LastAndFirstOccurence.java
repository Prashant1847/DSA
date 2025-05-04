package step_4_binary_search.lec_1_bs_on_arrays;

public class _6_LastAndFirstOccurence {

    private static int lastOccurence(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int lastOccurenceIndex = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target) high = mid -1 ;
            else if(arr[mid] <= target){
                if(arr[mid] == target)lastOccurenceIndex = mid;
                low = mid + 1;
            }
        }
        return lastOccurenceIndex;
    }

    private static int firstOccurence(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int firstOccurenceIndex = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= target){
                if(arr[mid] == target)firstOccurenceIndex = mid;
                high = mid -1 ;
            } else if(arr[mid] < target){
                low = mid + 1;
            }
        }
        return firstOccurenceIndex;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,13,13,13,20,40};
        int target = 13;

        System.out.println("Last occurence --> "+ lastOccurence(arr, target));
        System.out.println("First occurence --> "+ firstOccurence(arr, target));
    }
    
}
