import java.util.*;

public class N_largestNumber_3 {

    public static int maxNumbers(int marks[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (largest < marks[i]) {
                largest = marks[i];
            }
            // largest=Math.max(largest,marks[i]);

        }
        return largest;
    }

    public static void main(String args[]) {

        int marks[] = { -23, -34, -45, -56, -67 };

        System.out.print("The maximum among the numbers is " + maxNumbers(marks));

    }

}
