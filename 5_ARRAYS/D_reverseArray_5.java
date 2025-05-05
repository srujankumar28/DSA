public class D_reverseArray_5 {

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;

        }
        

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 2, 2, 7, 9, 4 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }

    }

}
