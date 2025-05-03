package step_3__problems_on_arrays.lec_3_hard;
import java.util.*;;

class Solution {
    public static int count = 0;

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                count += mid - left + 1;
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int countInversion(int[] arr, int low, int high) {
        if (low >= high) return count;
        int mid = (low + high) / 2 ;
        countInversion(arr, low, mid);  // left half
        countInversion(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
        return count;
    }
}


public class _10_Inversion{
    public static void main(String args[]) {
        // int arr[] = { 4, 2, 1, 6, 3, 0};
        // int arr[] = {1,2,3,4,5};
        // int arr[] = {5,3,2,1,4};
        int arr[] = {1, 3, 2, 3, 1};
        // int arr[] = {40, 25, 19, 12 ,9, 6, 2};
        int n = arr.length;

        int count = Solution.countInversion(arr, 0, n - 1);
        System.out.println("Total inversion count something --> " + count);
    }

} 
