package Arrays.Easy;
import java.util.*;

public class TwoSum {
    public static void twoSum(int[] arr, int n, int target){
        //Optimised Solution -> TC O(n) SC O(n)
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(target - arr[i])){
                result[0] = map.get(target-arr[i]);
                result[1] = i;
            }
            map.put(arr[i], i);
        }

        //Naive Solution -> TC (n^2) SC O(1)
        // int result[] = new int[2];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         if(arr[i] + arr[j] == target){
        //             result[0] = j;
        //             result[1] = i;
        //         }
        //     }
        // }


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int n = arr.length;
        int target = 9;

        twoSum(arr,n,target);
    }
}
