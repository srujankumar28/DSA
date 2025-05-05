
public class F_missingNumber {

    public static int missing(int arr[]) {
        int n = arr.length + 1;

        int allSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return allSum - sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println(missing(arr));
    }

}
