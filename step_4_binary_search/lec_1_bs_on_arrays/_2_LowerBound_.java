package step_4_binary_search.lec_1_bs_on_arrays;

public class _2_LowerBound_{
    
    //arr[lowerBoundIndex] >= target;
    private static int lowerBound(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int lowerBoundIndex = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] >= target) {
                lowerBoundIndex = mid;
                high = mid -1;
            }else low = mid + 1;
        }

        return lowerBoundIndex;
    }

    //where arr[floorIndex] <= x;
    static int findFloor(long arr[], int n, long x) {
        int low = 0, high = n - 1;
        int floorIndex = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x) high = mid -1 ;
            else if(arr[mid] < x){
                floorIndex = mid;
                low = mid + 1;
            }else{
                floorIndex = mid;
                break;
            }
        }

        return floorIndex;
    }


    public static void main(String args[]){
        int arr[] = {3,5,8,15,19};
        int target = 20;
        System.out.println("lower bound of "+target+" is --> "+lowerBound(arr, target));
    }
    
}