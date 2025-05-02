package I_Leaders;

import java.util.ArrayList;

public class brute {

    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                a.add(arr[i]);

            }

        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> a=leaders(arr);
        a.sort(null);   // if u want the elements in sorted order
        for(int e:a){
            System.out.print(e+" ");
        }
    }

}
