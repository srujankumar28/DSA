import java.util.*;

public class A_bubbleSort {

    public static void BubbleSort(int nums[]) {

        int n = nums.length;

        for (int i = 0; i <= n - 2; i++) { 

            for (int j = 0; j <= n - 2 - i; j++) {  // in each and every cycle.. one ele is sorted and that ele(max ele) is placed in the crt position
                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }

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

        int nums[] = { 2, 3, 1, 9, 33,4,5 };
        BubbleSort(nums);
        PrintArr(nums);

    }

}
