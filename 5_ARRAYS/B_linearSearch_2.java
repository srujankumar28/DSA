import java.util.*;

public class B_linearSearch_2 {

    public static int linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {

        int array[] = { 12, 23, 45, 62, 23, 122, 33 };
        // Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        int key = 62;
        System.out.println(linearSearch(array, key));

    }

}
