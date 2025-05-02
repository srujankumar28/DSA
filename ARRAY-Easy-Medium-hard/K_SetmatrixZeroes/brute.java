package K_SetmatrixZeroes;

public class brute { // (ON3)
    public static void setRows(int matrix[][], int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }

    }

    public static void setCol(int matrix[][], int j) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }

    }

    public static int[][] zeroes(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    setRows(matrix, i);
                    setCol(matrix, j);

                }

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1, 1 },
                           { 1, 0, 0, 1 },
                           { 1, 1, 0, 1 },
                           { 1, 1, 1, 1 } }; // whichever the element is marked zero that corresponding row and coulumn
                                  // becomes zero

        int res[][] = zeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
