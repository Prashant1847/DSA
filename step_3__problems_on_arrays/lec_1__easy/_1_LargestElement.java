
public class _1_LargestElement{
    static int largest(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++) if(max < arr[i]) max = arr[i];
        return max;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,34,5,5,};
        System.out.println("Largest element in the array => "+ largest(arr));
    }
}