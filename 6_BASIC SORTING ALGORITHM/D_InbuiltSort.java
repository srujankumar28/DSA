import java.util.Arrays;

public class D_InbuiltSort {

    public static void PrintArray(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String args[]) {

        int nums[] = { 2, 4, 1, 6, 3 };
        Arrays.sort(nums);
        PrintArray(nums);

    }

}
