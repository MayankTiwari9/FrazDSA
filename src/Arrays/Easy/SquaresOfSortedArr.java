package Arrays.Easy;

public class SquaresOfSortedArr {
    public static void squares(int nums[]){
        int l = 0, r = nums.length-1;
        int pointer = nums.length-1;

        int res[] = new int[nums.length];

        while (l <= r) {
            if(Math.abs(nums[l]) > Math.abs((nums[r]))){
                res[pointer] = nums[l] * nums[l];
                l++;
            }
            else{
                res[pointer] = nums[r] * nums[r];
                r--;
            }
            pointer--;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
    public static void main(String[] args) {
        int nums[] = {-7, -3, 2, 3, 11};

        squares(nums);
    }
}
