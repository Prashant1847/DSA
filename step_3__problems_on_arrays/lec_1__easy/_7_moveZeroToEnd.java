public class _7_moveZeroToEnd {

static void move(int arr[]){
    int n = arr.length;

    for(int i=0; i<n; i++){
        if(arr[i] == 0){
            for(int j=i; j<n-1; j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                
                arr[j+1] = temp;
            }
            n--;//brute force
        }
        }
    }

    static void optimal(int arr[]){
        int j= -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0 ){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i= j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }


public static void main(String[] args) {
     int arr[] = {2,0, 20, 0, 1, 1, 0};
    //  move(arr);
    optimal(arr);
    for(int i : arr){
        System.out.print(i+", ");
    }
 }   

}
