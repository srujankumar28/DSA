//-- UPPERBOUND IS SIMILAR TO LOWERBOUND, BUT THE ONLY DIFFERENCE IS IN THE CONDITION WHERE IN LOWERBOUND arr[mid]>=target AND IN UPPERBOUND IT IS arr[mid]>target

public class C_UpperBound {
    public static int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {  // >= in lowerbound
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 8, 10, 10, 11 };
        System.out.println(lowerBound(arr, 9));
    }

}
