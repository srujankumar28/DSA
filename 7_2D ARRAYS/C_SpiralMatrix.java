public class C_SpiralMatrix {

    public static void Spiralmatrix(int matrix[][]) {

        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;

        while ((StartRow <= EndRow) && (StartCol <= EndCol)) {

            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");

            }
            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");

            }
            for (int j = EndCol - 1; j >= StartCol; j--) {
                System.out.print(matrix[EndRow][j] + " ");

            }
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                System.out.print(matrix[i][StartCol] + " ");

            }

            StartRow++;
            StartCol++;
            EndCol--;
            EndRow--;
            
           

        }

        

    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3, 4 }, 
                           { 5, 6, 7, 8 }, 
                           { 9, 10, 11, 12 }, 
                           { 13, 14, 15, 16 } };
        Spiralmatrix(matrix);
    }

}


//----------------------------------------------------------------------------------------------------------
// import java.util.ArrayList;
// import java.util.Scanner;

// class z {

//     public static ArrayList<Integer> spiral(int matrix[][]) {

//         ArrayList<Integer> ans = new ArrayList<>();

//         int startRow = 0;
//         int startCol = 0;
//         int endrow = matrix.length - 1;
//         int endcol = matrix[0].length - 1;

//         while (startRow <= endrow && startCol <= endcol) {

//             for (int j = startCol; j <= endcol; j++) {
//                 ans.add(matrix[startRow][j]);
//             }
//             for (int i = startRow + 1; i <= endrow; i++) {
//                 ans.add(matrix[i][endcol]);
//             }
//             for (int j = endcol - 1; j >= startCol; j--) {
//                 ans.add(matrix[endrow][j]);
//             }
//             for (int i = endrow - 1; i >= startRow + 1; i--) {
//                 ans.add(matrix[i][startCol]);
//             }

//             startCol++;
//             startRow++;
//             endcol--;
//             endrow--;
//         }

//         return ans;

//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int matrix[][] = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         ArrayList<Integer> ans = spiral(matrix);
//         for (int i : ans) {
//             System.out.print(i + " ");
//         }

//     }
// }
