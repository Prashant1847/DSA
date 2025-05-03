package step_2__learn_sorting.lec_2__sorting_2;

public class RecursiveBubbleSort_2 {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubble(int arr[], int start, int end) {
        if (start >= 0) {
            bubble(arr, start - 1, end);
            if (arr[start] > arr[start + 1])
                swap(arr, start, start + 1);

            if (start + 1 == end) {
                bubble(arr, start - 1, end - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 9, 1, 10, 2, 3, 9, 8, 10 };
        bubble(arr, arr.length - 2, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + ", ");
        }

    }

}
