//BRUTE FORCE  O(n2)

public class D_DiagonalSum {

    public static int DiagonalSum(int matrix[][]) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }else if ((i + j) == matrix.length - 1) {  // please not that else if is imp.. if we remove else..the middle element will be added two times which results in wrong ans
                        sum = sum + matrix[i][j];

                    }
                }
            }
        
        return sum;
    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(DiagonalSum(matrix));

    }

}

// OPTIMIZED CODE 0(N)

// public class D_DiagonalSum {

// public static int DiagonalSum(int matrix[][]) {

// int sum = 0;
// for (int i = 0; i < matrix.length; i++) {
// sum = sum + matrix[i][i];
// if (i != matrix.length - 1 - i) {  // LETS TAKE THE EXAMPLE OF 3x3 MATRIX,, THE ELEMENT AT THE POSITION WILL BE ADDED TWO TIMES.. SO TO IGNORE THAT WHEN IT IS NOT EQAUL TO EACH OTHER.. THEN ONLY WE ARE ADDING IT TO THE DIAGONAL SUM
// sum = sum + matrix[i][matrix.length - i - 1];
// }

// }
// return sum;

// }

// public static void main(String args[]) {

// int matrix[][] = { { 1, 2, 3},{4,5,6},{7,8,9}};
// System.out.println(DiagonalSum(matrix));

// }
// }
