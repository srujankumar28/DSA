import java.util.*;

public class C_TreeMap {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        TreeMap<String, Integer> tm = new TreeMap<>();
        hm.put("India", 120);
        hm.put("China", 100);
        hm.put("Russia", 100);

        // ------------THE KEY WILL BE SORTED
        // HERE-----------------------------------------------------------------------------------------

        tm.put("India", 120);
        tm.put("Ahina", 100);
        tm.put("Russia", 100); 

        System.out.println(hm);
        System.out.println(tm);
    }
}
