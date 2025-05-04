package step_12_greedy.lec_2__medium;

import java.util.Arrays;

public class _1_MeetingScheduler {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public static int maxMeetings(int start[], int end[]) {
        int pairs[][] = new int[start.length][2];

        for (int i = 0; i < pairs.length; i++) {
            pairs[i][0] = start[i];
            pairs[i][1] = end[i];
        }

        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int count = 1, limit = pairs[0][1];

        for (int j = 1; j < start.length; j++) {
            if (pairs[j][0] > limit) {
                count++;
                limit = pairs[j][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int result = maxMeetings(start, end);
        System.out.println("Maximum number of meetings that can be held: " + result);
    }
}
