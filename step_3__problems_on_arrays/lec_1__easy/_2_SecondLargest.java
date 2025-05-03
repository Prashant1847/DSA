public class _2_SecondLargest {

    static int secondLargest(int arr[]){
        int max = arr[0] > arr[1] ? arr[0]: arr[1];
        int secondMax = arr[0] > arr[1] ? arr[1]: arr[0];

        for(int i=2; i<arr.length; i++){
            int n  = arr[i];
            if(n > max){
                secondMax = max;
                max = n;
            }else if(n < max && n > secondMax){
                secondMax = n;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 35, 5, 5};
        int arr[] = {99, 100, 0, 1, 2, 8, 8, 101};
        System.out.println("Second largest element in the array --> "+ secondLargest(arr));
    }
}
