package C_maxConsecOnes;

public class brute {
    public static int max(int arr[], int k) {
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int zero = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zero++;
                }
                if (zero <= k) {
                    int len = j - i + 1;
                    maxLen = Math.max(len, maxLen);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(max(arr, k));
    }

}
