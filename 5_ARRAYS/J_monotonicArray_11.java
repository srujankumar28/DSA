import java.util.*;

public class J_monotonicArray_11 {

    public static boolean isMonotonic(int nums[]) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <nums[i - 1]) {
                increasing = false;
            } else if (nums[i] >nums[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String args[]) {

        int nums[] = { 1, 2, 3, 4 ,5};
        System.out.println(isMonotonic(nums));
    }
}
