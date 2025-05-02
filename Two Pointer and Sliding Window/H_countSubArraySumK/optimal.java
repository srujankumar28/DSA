package H_countSubArraySumK;
// similar to the previous problem. here we need to return the count of odd numbers which are present in the array, similar to the previous problem,, here we can do modulus by 2 for the sum,, thta is the only one difference.. no of subarray which is having the count of odd numbers equal to k we need to return 



import java.util.*;

public class optimal {
    public static int ans(int arr[], int goal) {
        return sumArray(arr, goal) - sumArray(arr, goal - 1);

    }

    public static int sumArray(int arr[], int goal) {
        int l = 0;
        int r = 0;
        int count = 0;
        int n = arr.length;
        int sum = 0;
        while (r < n) {

            sum += arr[r]; // 1,1,0,1,1

            while (sum > goal) {
                sum -= arr[l];
                l++;
            }
            if (sum <= goal) {
                count = count + r - l + 1;
                r++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1};  
        int goal = 3;
        System.out.println(ans(arr, goal));
    }
}
