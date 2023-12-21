package Arrays.Easy;

public class FindPivotIndex {
    public static int pivotIndex(int nums[]){
        int n = nums.length;

        if(n == 0)
        return -1;

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = nums[0];
        right[n-1] = nums[n-1];

        for (int i = 1; i < n; i++) {
            left[i] = nums[i] + left[i-1];
            right[n-1-i] = nums[n-1-i] + right[n-i];
        }

        for (int i = 0; i < n; i++) {
            if(left[i] == right[i])
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }
}
