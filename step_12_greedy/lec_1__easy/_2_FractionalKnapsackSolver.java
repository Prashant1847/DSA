package step_12_greedy.lec_1__easy;

import java.util.*;

public class _2_FractionalKnapsackSolver {
    // Function to get the maximum total value in the knapsack.
    
    public static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int pairs[][] = new int[val.size()][2];

        for (int i = 0; i < pairs.length; i++) {
            pairs[i][0] = val.get(i);
            pairs[i][1] = wt.get(i);
        }

        Arrays.sort(pairs, (a, b) -> {
            double ratio1 = (double) a[0] / (double) a[1];
            double ratio2 = (double) b[0] / (double) b[1];

            if (ratio1 < ratio2) return 1;
            else if (ratio1 > ratio2) return -1;
            else return 0;
        });

        double maxValue = 0;
        int i = 0;

        while (capacity > 0 && i < pairs.length) {
            int value = pairs[i][0];
            int weight = pairs[i][1];

            if (weight <= capacity) {
                capacity -= weight;
                maxValue += value;
            } else {
                maxValue += ((double) value / (double) weight) * (double) capacity;
                capacity = 0;
            }
            i++;
        }
        return Math.round(maxValue * 1_000_000.0) / 1_000_000.0;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(60, 100, 120);
        List<Integer> weights = Arrays.asList(10, 20, 30);
        int capacity = 50;

        double result = fractionalKnapsack(values, weights, capacity);
        System.out.println("Maximum total value in the knapsack: " + result);
    }
}
