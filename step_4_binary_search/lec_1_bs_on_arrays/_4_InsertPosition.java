package step_4_binary_search.lec_1_bs_on_arrays;

public class _4_InsertPosition {

    private static int insertIndex(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int insertIndex = arr.length;

        //arr[insertIndex] > target;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] < target) low = mid + 1;
            else if(arr[mid] >= target){
                insertIndex = mid;
                high = mid - 1;
            }
        }

        return insertIndex;
    }

    public static void main(String args[]){
        int arr[] = {1,2,2,2,2,4,7};
        int target = 2;
        System.out.println("lower bound of "+target+" is --> "+insertIndex(arr, target));
    }
    
}
