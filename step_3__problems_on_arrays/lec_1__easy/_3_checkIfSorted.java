public class _3_checkIfSorted {
    static String sortedOrNote(int arr[]){
        for(int i=0; i<arr.length -1; i++){
            if(arr[i] > arr[i+1]) return "not sorted";
        }
        return "sorted";
    }

    public static void main(String[] args) {
        int arr[] = {1,2,8,5,5};
        System.out.println("Array is "+sortedOrNote(arr));
    }
}
