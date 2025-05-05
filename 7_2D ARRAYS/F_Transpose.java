
// // SUBMITTED IN LEETCODE GO AND CHECK THAT ONE PLEASE

// class Solution {
//     public int[][] transpose(int matrix[][]) {

//         //storing row length of original matrix
//         int m=matrix.length;
//         //storing column length of original length
//         int n=matrix[0].length;
//         //new matrix (temp) of dimensions n x m (original matrix dimension m x n)
//         int[][] temp=new int[n][m];
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 temp[j][i]=matrix[i][j];

//             }
//         }
//         return temp;
//     }
// }

public class F_Transpose {

    public static void Transpose(int arr[][]) {
        System.out.println("The original matrix is ");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[0].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("The trasnposed matrix is ");
        for (int i = 0; i <= arr[0].length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 } };
        Transpose(arr);
    }
}
