package Arrays.Easy;

public class MergedSortedArr {
    public static void merge(int[] nums1, int m , int[] nums2, int n ){
        int i = m - 1; //2
        int j = n - 1; //2
        
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[i+j+1] = nums1[i];
                i--;
            }
            else{
                nums1[i+j+1] = nums2[j];
                j--;
            }
        }
        while(j >= 0){
            nums1[j] = nums2[j];
            j--; 
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int m = 3;
        int arr2[] = {2,5,6};
        int n = 3;

        merge(arr1,m,arr2, n);
    }
}
