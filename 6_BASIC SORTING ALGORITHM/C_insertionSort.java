public class C_insertionSort {

    public static void InsertionSort(int nums[]) {

        // for (int i = 1; i < nums.length; i++) {

        // int curr = nums[i];
        // int prev = i - 1;
        // while ((prev >= 0) && (nums[prev] > curr)) {

        // nums[prev + 1] = nums[prev];
        // prev--;

        // }

        // nums[prev + 1] = curr;

        // }

        for (int i = 0; i <= nums.length - 1; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;

            }
        }

    }

    public static void PrintArray(int nums[]) {
        int n = nums.length;

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }

    public static void main(String args[]) {

        int nums[] = { 2, 4, 1, 6, 3 };
        InsertionSort(nums);
        PrintArray(nums);

    }

}
