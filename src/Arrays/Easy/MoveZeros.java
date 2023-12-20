package Arrays.Easy;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0,0,1,3,12};

        int nonZeroIndex = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
