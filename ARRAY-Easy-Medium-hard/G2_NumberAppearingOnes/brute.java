package G2_NumberAppearingOnes;
public class brute { // number appearing ones where other number repeated twice
    public static int repeatedOnce(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }

            }
            if (count == 1) {
                return num;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4 };
        System.out.println(repeatedOnce(arr));
    }
}
