import java.util.*;

public class B_Searching {

    public static int[] Search(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= m-1; j++) {
                if (matrix[i][j] == key) {
                   return new int[]{i,j};
                    
                }
            }
        }
        return new int[]{-1};

    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3 }, 
                           { 4, 5, 6 },
                           { 7, 8, 9 } };
        int key = 3;
        int res[]=Search(matrix, key);
        for(int e:res){
            System.out.print(e+" ");
        }

    }
}