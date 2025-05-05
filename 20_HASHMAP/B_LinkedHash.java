import java.util.*;

public class B_LinkedHash {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        hm.put("India", 120);
        hm.put("China", 100);
        hm.put("Russia", 100);

//------------ORDER WILL BE MAINTAINED IN LINKED HASHMAP-----------------------------------------------------------------------------------------

        lhm.put("India", 120);  
        lhm.put("China", 100);
        lhm.put("Russia", 100);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
