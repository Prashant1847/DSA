package step_3__problems_on_arrays.lec_2_medium;

public class _6_StockBuyAndSell {
    private static int maxProfit(int arr[]){
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }


    public static void main(String args[]){
        // int arr[] = {6, 1, 7, 2, 8 , 4};
        int arr[] = {7,1,5,3,6,4};
        // int arr[] = {7,6,4,3,1};

        System.out.println("Max proft of the week can be -> " + maxProfit(arr));
    }
}
