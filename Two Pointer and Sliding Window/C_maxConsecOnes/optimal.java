package C_maxConsecOnes;
import java.util.*;

class optimal {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0;
        int zeros = 0, maxLen = 0;
        while(r < n){
            if(nums[r] == 0){
                zeros++;  
            }
            while(zeros > k){
                if(nums[l] == 0){ 
                    /* Decrement zeros count
                    when moving left pointer */
                    zeros--; 
                }
                
                /* Move left pointer to the
                right to shrink the window */
                l++;  
            }
            
            maxLen = Math.max(maxLen, r - l + 1);
            r++;  
        }
        return maxLen; 
    }
    
    public static void main(String[] args) {
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2; // k represent that we can change k number of zeroes to 1 and we need to calculate the longest subarray which consist of consecutive ones
        
        // Create an instance of Solution class
        
        
        int length = longestOnes(input, k);
        
        // Print the result
        System.out.println("Length of longest substring with at most " + k + " zeros: " + length);
    }
}
