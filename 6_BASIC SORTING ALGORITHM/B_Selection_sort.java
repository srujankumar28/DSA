import java.util.*;

public class B_Selection_sort {

    public static void SelectionSort(int nums[]) {

        for (int i = 0; i <= nums.length - 1; i++) {

            int minPos = i;
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[j] < nums[minPos]) {
                    minPos = j;
                }
            }

            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;

        }
    }

    public static void PrintArray(int nums[]) {

        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String args[]) {
        int nums[]={2,4,6,1,3,5,8,0,7};

        SelectionSort(nums);
        PrintArray(nums);

    }

}
