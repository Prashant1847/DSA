package step_3__problems_on_arrays.lec_2_medium;
public class _9_leaders {

    private static void printLeader(int arr[]){
        int maxElementFromRight = arr[arr.length-1];

        System.out.print(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > maxElementFromRight){
                System.out.print(", "+arr[i]);
                maxElementFromRight = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 22 ,12, 3, 0, 6};
        printLeader(arr);
    }
    
}
