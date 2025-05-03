public class _5_shiftByD {

    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    static void shiftUsingReverse(int arr[], int d){
        reverse(arr, 0,  d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    static void shiftByTempArr(int arr[], int n, int d){
        d = d%n;

        int temp[] = new int[d];

        //copying first d element into temp array
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }

        //shifting remaining element to beginning of the array
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }


        //copying back element from temp array to original array remaining places
        for(int i = n-d; i<n; i++){
            arr[i] = temp[i - (n-d)];
        }

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        // shiftUsingReverse(arr, 3);
        shiftByTempArr(arr, 7, 3);
        for(int i : arr){
            System.out.print(i+", ");
        }
    }   
}
