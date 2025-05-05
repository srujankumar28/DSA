

// class brute {
//     public static int longest(int arr[], int k) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];
//                 if (sum == k)
//                     max = Math.max(max, j - i + 1);
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 3, 5, 1, 9 };
//         int k = 10;
//         System.out.println(longest(arr, k));
//     }

// }

//--------OPTIMAL----------------------------------------------------------------------------------------------
public class G1_maxLenSubArrayEqualsK {
    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:

            sum += a[right];
            right++;

        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 1, 9 };
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

