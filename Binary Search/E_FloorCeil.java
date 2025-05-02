

public class E_FloorCeil {

    public static int floor(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return ans;
    }

    public static int ceil(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;

            } else {
                low = mid + 1;

            }

        }
        return ans;
    }

    public static int[] floorandcell(int arr[], int target) {
        int f = floor(arr, target);
        int c = ceil(arr, target);
        return new int[] { f, c };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 7, 8, 9 };
        int ans[] = floorandcell(arr, 5);  // if target is given the element that is present in the array,, then the lowerbound and upperbound for that particular element will be that element itself
        

        System.out.print("floor = " + ans[0] + " ceil = " + ans[1]);
    }

}
