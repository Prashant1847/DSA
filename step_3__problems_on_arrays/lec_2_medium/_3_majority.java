package step_3__problems_on_arrays.lec_2_medium;
public class _3_majority {

    static int findMajority(int arr[]){
        int n = arr.length;
        int element = 0, count = 0;

        for(int i=0; i<n; i++){
            if(count == 0){
                element = arr[i];
                count = 1;
            }else if(element == arr[i]) count++;
            else count--;
        }

        int count1 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == element) count1++;
        }

        if(count1 > (n/2)) return element;
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {5,5,5,5,1,2,3};
        System.out.println("Majority element --> " + findMajority(arr));
    }
}
