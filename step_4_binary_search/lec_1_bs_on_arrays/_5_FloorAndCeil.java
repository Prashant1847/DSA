package step_4_binary_search.lec_1_bs_on_arrays;

public class _5_FloorAndCeil {

    //where arr[floorIndex] <= x;
    private static int[] floorAndCeil(int arr[], int target){
        int floorAndCeil[] =  {-1, -1};
        int low = 0, high = arr.length - 1;
        int floorIndex = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target) high = mid -1 ;
            else if(arr[mid] < target){
                floorIndex = mid;
                low = mid + 1;
            }else{
                floorAndCeil[0] = arr[mid];
                floorAndCeil[1] = arr[mid];
                return floorAndCeil;
            }
        }
 
        floorAndCeil[0] = floorIndex == -1 ? -1 : arr[floorIndex];
        floorAndCeil[1] = floorIndex != arr.length-1 ? arr[floorIndex+1] : -1;
        return floorAndCeil;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4};
        System.out.println(floorAndCeil(arr, 4));
    }
}
