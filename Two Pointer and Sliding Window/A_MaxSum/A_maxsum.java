package A_MaxSum;

class A_maxsum {
    public static int maxSum(int arr[], int k) {
        int n = arr.length;

        // Calculate initial left sum (sum of first k elements)
        int lsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }

        // Initialize right sum
        int rsum = 0;
        int maxsum = lsum;  // Set initial maxsum to the left sum

        // Start sliding the window
        for (int i = 0; i < k; i++) {
            lsum -= arr[k - 1 - i];   // Remove the last element of the left sum
            rsum += arr[n - 1 - i];  // Add the next element from the right
            maxsum = Math.max(maxsum, lsum + rsum);  // Update maxsum
        }

        return maxsum;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 2, 3, 4, 7 ,2,3};
        System.out.println(maxSum(arr, 4));  // Correct output: 19
    }
}
