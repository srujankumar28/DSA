

public class S_wavetraversal {

    public static void wavetraversal(int matrix[][], int m, int n) {
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i <=m-1; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };

        wavetraversal(matrix, 4, 4);
    }

}