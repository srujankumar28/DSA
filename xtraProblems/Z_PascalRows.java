package Problems;

import java.util.Scanner;

public class Z_PascalRows {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i+1 column
            /*
             * arr[0]=new int[1]
             * arr[1]=new int[2]
             */
            // for every row we are going to
            // create a 1D array

            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            // j starts from 1 to i-1 because
            // we are already assigned 1 to
            // first and last element
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");

        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);

    }

}
