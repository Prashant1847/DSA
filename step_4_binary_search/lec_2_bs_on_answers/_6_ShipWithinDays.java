package step_4_binary_search.lec_2_bs_on_answers;

public class _6_ShipWithinDays {

    private static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;
        int n = v.length;
        // find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    private static int totalDaysToShipAll(int[] arr, int capacity) {
        int totalDays = 0;
        int currentWeight = 0;

        for (int i = 0; i < arr.length; i++) {
            if (currentWeight + arr[i] <= capacity) {
                currentWeight += arr[i];
            } else {
                totalDays++;
                currentWeight = arr[i];
            }
        }
        return ++totalDays; // adjusting for the last package
    }

    public static int shipWithinDays(int[] arr, int days) {
        int minWeight = findMax(arr);
        int maxWeight = 0;
        for (int i = 0; i < arr.length; i++) maxWeight += arr[i];

        while (minWeight <= maxWeight) {
            int weight = (minWeight + maxWeight) / 2;
            int daysToShip = totalDaysToShipAll(arr, weight);

            if (daysToShip <= days) maxWeight = weight - 1;
            else minWeight = weight + 1;
        }

        return minWeight;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;
        int result = shipWithinDays(weights, days);
        System.out.println("Minimum weight capacity to ship within " + days + " days: " + result);
    }
}
