
public class _10_findMissing {
    static int missing(int arr[], int n){
        int sum = (n*(n+1)) / 2;

        for(int i=0; i<arr.length; i++){
            sum -= arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,4,5};
        // int n = 5;

        int arr[] = {1,3};
        int n = 3;

        System.out.println("Missing element is " +missing(arr, n));
    }
    
}
