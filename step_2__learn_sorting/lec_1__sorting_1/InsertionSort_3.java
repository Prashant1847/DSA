package step_2__learn_sorting.lec_1__sorting_1;

public class InsertionSort_3 {
    static void printArray(int arr[]){
        for(int element: arr) System.out.print(element + ", ");
        System.out.println();
    }

    static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i = 1; i<n; i++){
            int j = i-1;
            int element = arr[i];

            while(j>= 0 && element < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            
            if(j != i-1){
                
                arr[j+1] = element;
            }
        }
    }

    public static void main(String args[]){
        int toSort[] = {3, 2, 1};
        insertionSort(toSort);
        printArray(toSort);
    }    
}
