package Hard1_SearchInSortedMatrix;

public class brute {
    public static int[] Search(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1 };
    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 4, 7, 9 }, { 12, 13, 16, 18 }, { 20, 21, 23, 29 } };
        int target = 29;
        int ans[] = Search(matrix, target);

        System.out.println(ans[0] + " ," + ans[1]);

    }

}
