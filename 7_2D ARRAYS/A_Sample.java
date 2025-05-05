import java.util.*;

public class A_Sample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt(); 

        System.out.println("Enter the number of columns");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter the elements");

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("The elements are  ");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }

}
