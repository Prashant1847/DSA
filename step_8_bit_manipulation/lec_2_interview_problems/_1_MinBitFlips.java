package step_8_bit_manipulation.lec_2_interview_problems;

public class _1_MinBitFlips {

    public static int minBitFlips(int start, int goal) {
        int changes = start ^ goal;
        int noOfChanges = 0;

        while (changes > 0) {
            noOfChanges += changes & 1;
            changes = changes >> 1;
        }
        return noOfChanges;
    }

    public static void main(String[] args) {
        int start = 10; // Binary: 1010
        int goal = 7;   // Binary: 0111

        int result = minBitFlips(start, goal);
        System.out.println("Minimum bit flips required to convert " + start + " to " + goal + ": " + result);
    }
}

