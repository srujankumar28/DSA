package J_HwmanyTimesArraySorted;

public class J_HwManyTimeArrRotated {
    public static int min(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) { // left part of the array is sorted

                if (arr[low] < ans) {
                    ans = arr[low];
                    idx = low;

                }
                low = mid + 1;

            } else { // right part of the array is sorted

                if (arr[mid] < ans) {
                    ans = arr[mid];
                    idx = mid;

                }
                high = mid - 1;

            }

        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 1, 2, 3 };
        System.out.println(min(arr));
    }
}
