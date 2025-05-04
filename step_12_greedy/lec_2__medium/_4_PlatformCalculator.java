package step_12_greedy.lec_2__medium;

import java.util.Arrays;

public class _4_PlatformCalculator {

    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    public static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0; // i for arrival time index, j for departure time index
        int trains = 0, stations = 0;

        while (i < arr.length) {
            if (arr[i] <= dep[j]) {
                if (trains + 1 > stations) stations++;
                trains++;
                i++;
            } else {
                j++;
                trains--;
            }
        }

        return stations;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findPlatform(arrival, departure);
        System.out.println("Minimum number of platforms required: " + result);
    }
}
