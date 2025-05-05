package G6_MajorityElement;

public class optiml {
    public static int majority(int arr[]) {
        int count = 0;
        int el = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];

            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }

        }
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                cnt++;

            }

        }
        if (cnt > (arr.length / 2)) {
            return el;
        }

        return -1;
    }

    public static void main(String[] args) { // MOORES VOTING ALGO
        int arr[] = { 1, 2, 2, 2, 2, 3, 3 };
        System.out.print(majority(arr));
    }

}
