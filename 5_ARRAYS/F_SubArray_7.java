public class F_SubArray_7 {

    // public static void Subarray(int numbers[]) {
    // int count = 0;
    // for (int i = 0; i <= numbers.length-1; i++) {
    // int start=i;
    // for (int j = i; j <= numbers.length-1; j++) { //do it i+1 and see the change
    // int end=j;
    // for (int k = start; k <=end; k++) {
    // System.out.print(numbers[k]+ " "); // PRINTS THE SUBARRAY
    // }
    // count++;

    // System.out.println();

    // }

    // }
    // System.out.println("Total number of subarrays is = " + count);

    // }

    public static void Subarray(int numbers[]) {
        for (int i = 0; i <= numbers.length - 1; i++) {

            for (int j = i; j <= numbers.length - 1; j++) { // do it i+1 and see the change

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " "); // PRINTS THE SUBARRAY
                }

                System.out.println();

            }

        }

    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10 };
        Subarray(numbers);
    }

}
