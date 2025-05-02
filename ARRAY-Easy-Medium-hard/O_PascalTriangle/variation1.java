package O_PascalTriangle;

import java.util.*;

public class variation1 {

    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);   // 1 4 6 4 1 
    }
}
    