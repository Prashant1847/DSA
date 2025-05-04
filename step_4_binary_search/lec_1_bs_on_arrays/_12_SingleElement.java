package step_4_binary_search.lec_1_bs_on_arrays;

public class _12_SingleElement {

    private static int singleElement(int nums[]){
        int low = 0, high = nums.length -1;

        while(low < high){
            if(low == high) return nums[low];

            int mid = (low + high) / 2;

            if(nums[mid] != nums[mid -1] && nums[mid] != nums[mid + 1]) return nums[mid];

            if(mid % 2 == 0){
                if(nums[mid] == nums[mid + 1]) low = mid + 2;
                else high = mid - 2;
            }else{
                if(nums[mid] != nums[mid + 1]) low = mid + 1;
                else high = mid -1;
            }
        }

        return nums[low]; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        System.out.println("Single element is --> "+singleElement(arr));
    }
    
}
