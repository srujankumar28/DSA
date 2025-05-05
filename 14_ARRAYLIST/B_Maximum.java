import java.util.*;

public class B_Maximum {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int largest = Integer.MIN_VALUE;
        

        for (int i = 0; i < list.size(); i++) {
            if (largest < list.get(i)) {
                largest = list.get(i);
            }

        // largest=Math.max(largest,list.get(i)); 
        }

        System.out.println("The largest is " + largest);
    }
}
