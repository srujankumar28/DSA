
import java.util.*;

public class N_ThreeSum {
    public static int[] threesum(int arr[], int target) {

        Arrays.sort(arr);
        for (int left = 0; left <= arr.length - 3; left++) {
            int right = left + 1;
            int last = arr.length - 1;

            while (left < last) {
                int sum = arr[left] + arr[right] + arr[last];
                if (sum == target) {
                    return new int[] { arr[left], arr[right], arr[last] };  // return true;
                } else if (sum > target) {
                    last--;
                } else {
                    left++;
                }

            }

        }
        // return false;
        return new int[] { -1 };
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 0, 7, 8, 9 };
        int target = 6;

        // System.out.println(threesum(arr, target));
        int res[] = threesum(arr, target);
        for (int e : res) {
            System.out.print(e + " ");
        }

    }
}
