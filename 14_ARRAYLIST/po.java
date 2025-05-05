import java.util.*;

public class po {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list);

        int element = list.get(1);
        System.out.println(element);
        System.out.println(list);

        list.add(1,9);
        System.out.println(list);



    }

}
