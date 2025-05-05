

public class I_findMinInRotatedSorted {
    public static int min(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) { // left part of the array is sorted
                ans = Math.min(ans, arr[low]);
                low = mid + 1;

            } else { // right part of the array is sorted
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 11, 2, 3, 4 };
        System.out.println(min(arr));
    }
}
