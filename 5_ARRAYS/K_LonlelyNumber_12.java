import java.util.Arrays;

public class K_LonlelyNumber_12 {

    public static void isLonely(int nums[]) {

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                if ((nums[i + 1] - nums[i]) > 1) {
                    System.out.println(nums[i]);
                }
            } else if (i == (n - 1)) {
                if ((nums[i] - nums[i - 1]) > 1) {
                    System.out.println(nums[i]);
                }
            } else {
                if (((nums[i + 1] - nums[i]) > 1) && ((nums[i] - nums[i - 1]) > 1)) {
                    System.out.println(nums[i]);
                }

            }

        }
    }

    public static void main(String args[]) {

        int nums[] = { 1, 2, 3, 5, 7, 9 };
        isLonely(nums);

    }

}