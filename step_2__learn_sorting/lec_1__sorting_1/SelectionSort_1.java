package step_2__learn_sorting.lec_1__sorting_1;

public class SelectionSort_1{
    
    static void selectionSort(int arr[]){
        int size = arr.length;

        for(int i=0; i<size - 1; i++){
            int minIndex = i;

            for(int j=i+1; j<size ; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }

            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

    }

    static void printArray(int arr[]){
        for(int element: arr) System.out.print(element + ", ");
        System.out.println();
    }


    public static void main(String args[]){
        int toSort[] = {3, 2, 1};
        selectionSort(toSort);
        printArray(toSort);
    }
}