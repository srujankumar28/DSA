package Hard1_ReturnRowHavMaxOnes;

public class brute {
    public static int maxOnes(int matrix[][]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int index=0;;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];

            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        return index+1;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 0, 0, 1 }, { 0, 1, 1 } };
        System.out.println("Row = " + maxOnes(matrix));
    }

}
