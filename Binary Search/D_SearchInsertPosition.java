
// SIMILAR TO LOWER BOUND 
public class D_SearchInsertPosition {
    public static int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length; // remember we are going to return the length of the array if no position found
                              // to insert which means the element is which has to be inserted is larger than
                              // all the element so it should be inserted at the last position.

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;

            }

        }
        return ans;// return low

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 8, 10, 10, 11 }; // INSERT AT THE CORRECT POSITION SO THAT SORTED ORDER
                                                         // MAINTAINED
        System.out.println(lowerBound(arr, 9));
    }

}
