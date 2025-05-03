package step_3__problems_on_arrays.lec_2_medium;

public class _2_sort012 {
    static void sort_optimal(int arr[]){
        int low = 0, high = arr.length-1, mid = 0;
        while(mid <= high){
            int midElement = arr[mid];
            if(midElement == 0){
                int temp = arr[low];
                 arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(midElement == 1){
                mid++;
            }else{
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        sort_optimal(arr);
        
        for(int i: arr) System.out.print(i+", ");
    }

}
