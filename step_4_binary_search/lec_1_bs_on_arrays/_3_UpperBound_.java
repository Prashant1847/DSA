package step_4_binary_search.lec_1_bs_on_arrays;

public class _3_UpperBound_ {
    private static int upperBound(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int upperBoundIndex = -1;

        //arr[upperBoundIndex] > target;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] <= target) low = mid + 1;
            else if(arr[mid] > target){
                upperBoundIndex = mid;
                high = mid - 1;
            }
        }

        return upperBoundIndex;
    }

    public static void main(String args[]){
        int arr[] = {1,2,2,3};
        int target = 2;
        System.out.println("lower bound of "+target+" is --> "+upperBound(arr, target));
    }
}
