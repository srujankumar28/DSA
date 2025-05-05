package U_SimilarConcepts;

import java.util.*;

public class Painterpartition {
    public static int countPainters(int[] boards, int time) {
        int n = boards.length; // size of array.
        int painters = 1;
        long boardsPainter = 0;
        for (int i = 0; i < n; i++) {
            if (boardsPainter + boards[i] <= time) {
                // allocate board to current painter
                boardsPainter += boards[i];
            } else {
                // allocate board to next painter
                painters++;
                boardsPainter = boards[i];
            }
        }
        return painters;
    }

    public static int findLargestMinDistance(int[] boards, int k) {
        int low = Arrays.stream(boards).max().getAsInt();
        int high = Arrays.stream(boards).sum();

        // Apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);
            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;
        int ans = findLargestMinDistance(boards, k);
        System.out.println("The answer is: " + ans);
    }
}
