import java.util.*;

public class A_modifiedBubble {

    public static void BubbleSort(int nums[]) {

        int n = nums.length;

        for (int i = 0; i <=n - 2; i++) {  // LAST ELEMENT IS ALREADY SORTED
            int swapped = 0;
            for (int j = 0; j <= n - 2 - i; j++) {  
                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = 1;

                }

            }
            if (swapped == 0) {
                break;
            }
        }
    }

    public static void PrintArr(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
   

    }

    public static void main(String args[]) {

        int nums[] = { 2, 3, 1, 9, 3 };
        BubbleSort(nums);
        PrintArr(nums);

    }

}
