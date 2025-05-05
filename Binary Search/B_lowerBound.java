//-- LOWER BOUND THE LEAST ELEMENT WHICH IS GREATER THAN OR EQAUL TO THE GIVEN ELEMENT-//
public class B_lowerBound {
    public static int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length; // any ele not found as the lowerbound then return the size of the array ele as lowerbound

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {  
                ans = mid;
                high = mid - 1;  // we need the idx of the element which is just greater than the given target element.. so if found the greater element reduce to get just greater.

            } else {
                low = mid + 1;

            }

        }
        return ans;  //return low;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 8, 10, 10, 11 };
        System.out.println(lowerBound(arr, 9));  // getting ans 7 which is the index of the array
    }

}
