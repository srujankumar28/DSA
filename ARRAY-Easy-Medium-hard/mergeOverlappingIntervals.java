import java.util.*;

public class mergeOverlappingIntervals {

    public static List<int[]> mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) return new ArrayList<>();

        // Step 1: Sort the intervals based on the starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Initialize a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through each interval
        for (int[] interval : intervals) {
            // If the list is empty or the current interval does not overlap with the previous, add it
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Otherwise, there is overlap, so merge the current interval with the previous one
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        List<int[]> mergedIntervals = mergeIntervals(intervals);

        System.out.println("The merged intervals are: ");
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        
    }
}
