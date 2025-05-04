package step_4_binary_search.lec_1_bs_on_arrays;

public class _9_minimumElement {

    private static int minElement(int nums[]){
        int min = Integer.MAX_VALUE;
        int low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            //if condition when duplicate element in numsay [3, 1, 3 ,3, 3]
            if((nums[mid] == nums[low]) && nums[mid] == nums[high]){
                high --;
                low++;
                continue;
            }

            //search space is sorted already
            if (nums[low] <= nums[high]) {
                min = Math.min(min, nums[low]);
                break;
            }

            //left sorted
            if(nums[low] <= nums[mid]){
                min = Math.min(nums[low], min);
                low = mid + 1;
            }else{
            //right sorted
                min = Math.min(nums[mid], min);
                high = mid - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // int arr[] = {4,5,6,7,0,1,2,3};
        int arr[] = {3,4,5,1,2};
        System.out.println("Minimum element is --> "+minElement(arr));
    }
    
}
