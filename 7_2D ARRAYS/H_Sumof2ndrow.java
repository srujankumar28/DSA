public class H_Sumof2ndrow {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 4, 4, 2, 5 } };
        int sum = 0;

        for (int j = 0; j <= arr[0].length - 1; j++) {
            sum += arr[1][j];
        }
        System.out.println("sum=" + sum);
    }

}
