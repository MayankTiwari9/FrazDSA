package Arrays.Easy;

public class TwoSum {
    public static void twoSum(int[] arr, int n, int target){

        //Naive Solution -> TC (n^2) SC O(1)
        int result[] = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i] + arr[j] == target){
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 3};
        int n = arr.length;
        int target = 6;

        twoSum(arr,n,target);
    }
}
