package H_SearchInRotatedSortedArray;

public class variation1 {
    public static int search(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) { // left part sorted
                if ((arr[low] <= target) && (target <= arr[mid])) {
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }

            } else { // right part will be sorted
                if ((arr[mid] <= target) && (target <= arr[high])) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 5));

    }

}
