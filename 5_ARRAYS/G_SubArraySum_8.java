// import java.util.*;

// public class G_SubArraySum_8 {

//     public static int Subarray(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int CurrSum = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             CurrSum = 0;
//             for (int j = i; j < numbers.length; j++) {

//                 CurrSum = CurrSum + numbers[j];

               

                

//             }
//             maxSum=Math.max(maxSum,CurrSum);
            

//         }
//         return maxSum;

//     }

//     public static void main(String args[]) {

//         int numbers[] = { 1,2,3,4,5 };
//         System.out.println(Subarray(numbers));

//     }

// }

// *****-------KADANES ALGORITHM-------************

import java.util.*;

public class G_SubArraySum_8 {

    public static int maxSubArray(int nums[]) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (max < sum) {
                max = sum;
            }

            if (sum < 0)
                sum = 0;
        }

        return max;
    }

    public static void main(String args[]) {
        // int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int nums[] = { -2, -3, -1,5 };
        int max = maxSubArray(nums);
        System.out.println("The maximum Subarray sum is " + max);

    }

}
