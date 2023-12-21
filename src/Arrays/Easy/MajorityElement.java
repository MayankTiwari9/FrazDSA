package Arrays.Easy;

public class MajorityElement {
    public static int majorElem(int nums[]){
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int cnt = 1;
            for (int j = i+1; j < nums.length; j++) 
                if(nums[j] == nums[i])
                cnt++;

                if(cnt > n/2)
                return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorElem(nums));
    }
}
