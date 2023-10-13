package Arrays.Easy;

public class BuyAndSellStock {
    public static int stock(int[] arr, int n){
        //Optimised Solution -> TC O(n) SC O(1)
        int maxProfit = 0;
        int minSoFar = arr[0];

        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;

        //Naive Solution -> TC O(n^2) SC O(1)
        // int max = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j] > arr[i]){
        //             int sum = arr[j] - arr[i];
        //             max = Math.max(sum,max);
        //         }
        //     }
        // }
        // return max;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int n = arr.length;

        System.out.println(stock(arr,n));
    }    
}