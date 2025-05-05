// SEARCH IN THE SORTED ARRAY - BINARY SEARCH APPROACH

// PLEASE REFER TO THE YOUTUBE VIDEO FOR MORE CLEARANCE

public class M_SearchInSorted_14 {

    public static int SeachSorted(int nums[], int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {  // to get out which half of the array is sorted
                if ((nums[low] <= target) && (target <= nums[mid])) { // you are in the lef tpart of the array
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {

                if ((nums[mid] <= target) && (target <= nums[high])) {  // you are on the right part of the array

                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }

        }

        return -1;
    }

    public static void main(String args[]) {

        int nums[] = { 4, 5, 6, 7, 0, 1, 2 }; // THIS IS THE ARRAY WHICH IS BEING ROTATED AT THE PARTICULAR PIVOT POINT
        int target = 2;

        System.out.println(SeachSorted(nums, target));

    }

}
