package Hard1_SearchInSortedMatrix;

class sol {

    public static int[] Search(int matrix[][], int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= col) {

            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 4, 7, 9 }, { 12, 13, 16, 18 }, { 20, 21, 23, 29 } };
        int target = 29;
        int ans[] = Search(matrix, target);

        System.out.println(ans[0] + "," + ans[1]);
    }
}