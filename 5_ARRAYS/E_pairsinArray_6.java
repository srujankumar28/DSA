import java.util.*;

public class E_pairsinArray_6 {

    public static void pairsArray(int numbers[]) {
        for (int i = 0; i <= numbers.length-1; i++) {
            for (int j =i+1; j <= numbers.length-1; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")"+"  ");
            }
        }
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10 };
        pairsArray(numbers);
    }

}
