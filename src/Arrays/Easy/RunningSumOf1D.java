package Arrays.Easy;

public class RunningSumOf1D {
    public static void runningSum(int []nums){
        int n = nums.length;
        int res[] = new int[n];

        res[0] = nums[0];

        for (int i = 1; i < n; i++) {
            res[i] = nums[i] + res[i-1]; 
        }
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 10, 1};

        runningSum(arr);
    }
}
