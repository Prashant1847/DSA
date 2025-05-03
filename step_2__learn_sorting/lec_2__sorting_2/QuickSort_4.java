package step_2__learn_sorting.lec_2__sorting_2;

public class QuickSort_4 {

    static void qs(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            qs(arr, low, pivot - 1);
            qs(arr, pivot + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivotValue = arr[low];
        int i = low;
        int j = high;
        // int arr[] = {8, 6, 2, 5, 7, 3, 1, 10};

        while (i < j) {
            while (arr[i] <= pivotValue && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivotValue && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 6, 2, 5, 7, 3, 1, 10 };
        qs(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + ", ");
        }
    }

}
