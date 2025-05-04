package step_4_binary_search.lec_2_bs_on_answers;

class _4_MBouquetes {
    private static int maxElement(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    private static boolean checkIfBouquetsPossible(int arr[], int totalBouquets, int sizeOfBouquets, int days){
        int count = 0;
        int totalBouquetsPossible = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= days) count++;
            else count = 0;
            if(count == sizeOfBouquets) {
                totalBouquetsPossible++;
                count = 0;
            }
        }
        return totalBouquetsPossible >= totalBouquets;
    }

    public int minDays(int[] arr, int totalBouquets, int sizeOfBouquets) {
         int low = 1; 
         int maximumDays = maxElement(arr);
         int high = maximumDays;

        while(low <= high){
            int mid = (low + high) / 2;
            boolean enoughDays = checkIfBouquetsPossible(arr, totalBouquets, sizeOfBouquets, mid);

            if(enoughDays) high = mid - 1;
            else low = mid + 1;
        }
        return low > maximumDays ? -1: low;
    }
}
