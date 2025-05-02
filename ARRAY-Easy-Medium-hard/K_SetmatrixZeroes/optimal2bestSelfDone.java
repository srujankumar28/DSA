package K_SetmatrixZeroes;
class optimal2bestSelfDone {
    public static int[][] makezero(int matrix[][]) {
        int ans[] = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    ans[0] = i;
                    ans[1] = j;

                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == ans[0] || j == ans[1]) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

        int ans[][] = makezero(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}