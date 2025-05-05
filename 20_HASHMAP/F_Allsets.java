import java.util.*;

public class F_Allsets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Noida");
        cities.add("Delhi");

        // Iterator it= cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());

        // }

        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println();

        //------------------LINKEDHASHSET---------------------------------------------------------------------------------------
        LinkedHashSet<String> cities1 = new LinkedHashSet<>();
        cities1.add("Mumbai");
        cities1.add("Bengaluru");
        cities1.add("Noida");
        cities1.add("Delhi");

        for (String city : cities1) {
            System.out.println(city);
        }
        System.out.println();

        //----------------------------TREESET-----------------------------------------------------------------------
        TreeSet<String> cities2 = new TreeSet<>();
        cities2.add("Mumbai");
        cities2.add("Bengaluru");
        cities2.add("Noida");
        cities2.add("Delhi");

        for (String city : cities2) {
            System.out.println(city);
        }
        System.out.println();




    }

}