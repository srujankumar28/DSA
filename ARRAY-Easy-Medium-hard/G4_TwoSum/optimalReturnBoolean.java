package G4_TwoSum;

import java.util.*;

public class optimalReturnBoolean {
    public static int[] twoSum(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
            //    return true;
            return new int[]{arr[left],arr[right]};

            } else if (sum < target)
                left++;
            else
                right--;
        }
        return new int[]{};
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 10;
         /// REMEMBER U CANT RETURN THE INDEX HERE,,
        // BECUASE WE ARE SORTING THE ARRAY, THATS Y THE INDEX OF THE ORIGINAL ARRAY IS
        // DIFFRENT FROM THE SORTED ARRAY,, BUT WE CAN RETURN BOOLEAN VALUE HERE,, IF U
        // WANT TO RETURN THE INDX,, GO FOR HASHING SOLUTION
        // for(int i:ans){
        // System.out.print(i+" ");
        // }
       
        // System.out.println(twoSum(n, arr, target));;
        int ans[]=twoSum(n, arr, target);
        for(int i:ans){
            System.out.print(i+" ");
        }

    }

}