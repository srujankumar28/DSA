import java.util.ArrayList;

public class C_Swap {

    public static void Swap(ArrayList<Integer> list, int i, int j) {

       int temp1=list.get(i);
       int temp2=list.get(j);
       list.set(j,temp1);
       list.set(i,temp2);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int i = 1, j = 3;
        System.out.println(list);
        Swap(list, i, j);
        System.out.println(list);

    }

}
