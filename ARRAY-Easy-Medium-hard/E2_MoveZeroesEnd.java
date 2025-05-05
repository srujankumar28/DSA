// import java.util.ArrayList;

// class E2_MoveZeroesEnd {
//     public static int[] zeroes(int arr[]) {
//         ArrayList<Integer> a = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 a.add(arr[i]);
//             }
//         }

//         for (int i = 0; i < a.size(); i++) {
//             arr[i] = a.get(i);
//         }

//         for (int i = a.size(); i < arr.length; i++) {
//             arr[i] = 0;
//         }
//         return arr;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 0, 3, 1, 0, 5, 0 };
//         int ans[] = zeroes(arr);
//         for (int i : ans) {
//             System.out.print(i + " ");
//         }
//     }
// }

public class E2_MoveZeroesEnd {
    public static int[] last(int arr[]) {
        int size = arr.length;
        int nz = 0;
        int z = 0;

        while (nz < size) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;

            } else {
                nz++;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 0, 0, 4, 9, 0 };
       last(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}