package H_countSubArraySumK;
import java.util.*;


class bestOptimal {
    public static int subarraySum(int[] nums, int k) {
        // HashMap to store prefix sum and its frequency
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Initialize with sum 0 occurring once

        int count = 0, currentSum = 0;

        for (int num : nums) {
            currentSum += num; // Update the running sum

            // Check if there exists a prefix sum that makes current_sum - k
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            // Store the current sum in the map
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = { 1,2,1,2,2,4 };
        int k = 4;
        System.out.println("Number of subarrays with sum " + k + " is: " + subarraySum(nums, k));
    }
}
