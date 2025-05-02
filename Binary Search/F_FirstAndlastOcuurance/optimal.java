package F_FirstAndlastOcuurance;

public class optimal {

    public static int first(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int last(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] occurance(int arr[], int target) {
        int f = first(arr, target);
        if (f == -1) {
            return new int[] { -1, -1 };  // if first occurance is not found there is no question of last occurane too..
        }
        int l = last(arr, target);
        return new int[] { f, l };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6, 7 };
        int ans[] = occurance(arr, 4);
        System.out.print("First= " + ans[0] + " last= " + ans[1]);
    }

}
