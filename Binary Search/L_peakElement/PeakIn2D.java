package L_peakElement;

public class PeakIn2D {
    public static int max(int matrix[][], int row, int col) {
        int idx = 0;
        int value = 0;

        for (int i = 0; i < row; i++) {
            if (matrix[i][col] > value) {
                value = matrix[i][col];
                idx = i;
            }

        }
        return idx;
    }

    public static int[] peak(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = m - 1; // wrt to col we had taken here,, we can take row also
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = max(matrix, n, mid);
            int left;
            int right;

            if (mid - 1 >= 0) {
                left = matrix[row][mid - 1];
            } else {
                left = -1; // boundary condition to the left
            }

            if (mid + 1 < m) {
                right = matrix[row][mid + 1];
            } else {
                right = -1; // boundary condition to the right
            }

            if (left < matrix[row][mid] && matrix[row][mid] > right) {
                return new int[] { row, mid };
            } else if (left > matrix[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 5, 6 }, { 9, 8, 1, 3 }, { 2, 7, 6, 10 }, { 6, 5, 2, 3 } };
        int ans[] = peak(matrix);
        System.out.println(ans[0] + ", " + ans[1]);
    }

}
