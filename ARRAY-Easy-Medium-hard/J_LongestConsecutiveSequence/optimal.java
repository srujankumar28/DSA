package J_LongestConsecutiveSequence;

import java.util.Arrays;

public class optimal {
    public static int longest(int arr[]) {
        Arrays.sort(arr);
        int longest = 1;
        int lastsmaller = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] - 1) == lastsmaller) {
                count++;
                lastsmaller = arr[i];

            } else if (arr[i] != lastsmaller) {
                count = 1;
                lastsmaller = arr[i];

            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        System.out.println(longest(arr));
    }

}
