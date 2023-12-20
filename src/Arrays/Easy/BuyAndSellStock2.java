package Arrays.Easy;

public class BuyAndSellStock2 {
    public static int buyAndSell(int []arr){

        //Optimised Solution :- TC O(N) SC O(1)
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1])
            max = max + (arr[i] - arr[i-1]);
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7, 6, 4, 3, 1};

        System.out.println(buyAndSell(arr));
    }
}
