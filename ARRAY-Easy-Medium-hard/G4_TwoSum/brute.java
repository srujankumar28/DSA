
package G4_TwoSum;
import java.util.*;

public class brute {
    public static int[] twoSum(int n, int []arr, int target) {
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};   //return true
                }
            }
        }
        return new int[]{-1,-1};   // return false.. if u returning boolean value if it is eqaual or not
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");
    }

}