package G3_LongestSubarrayK;

class brute {
    public static int longest(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 9 };
        int k = 10;
        System.out.println(longest(arr, k));
    }

}