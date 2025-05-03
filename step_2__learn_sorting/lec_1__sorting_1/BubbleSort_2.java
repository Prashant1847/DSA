package step_2__learn_sorting.lec_1__sorting_1;

public class BubbleSort_2 {

    static void bubbleSort(int arr[]){
        int size = arr.length;

        for(int i=size-1; i>= 0; i--){
            int didSwap = 0;
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
        }
    }

    static void printArray(int arr[]){
        for(int element: arr) System.out.print(element + ", ");
        System.out.println();
    }

    public static void main(String args[]){
        int toSort[] = {3, 2, 1};

        bubbleSort(toSort);
        printArray(toSort);
    }
    
}
