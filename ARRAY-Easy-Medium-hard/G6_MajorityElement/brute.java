package G6_MajorityElement;

public class brute {
    public static int majority(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }

            }
            if (count > (arr.length) / 2) {
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 3 };
        System.out.println(majority(arr));

    }

}
