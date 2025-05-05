import java.util.*;

public class A_Basics {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // INSERT

        hm.put("India", 120);
        hm.put("China", 100);
        hm.put("Russia", 100);

        System.out.println(hm); // REMEMBER THAT IT DOES NOT FOLLOW THE ORDER,,IN WHICH THE INPUT WAS GIVEN.. IT
                                // FOLLOWS THE RANDOM ORDER

        // //GET
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("lowda"));

        // CONTAINS KEY

        // System.out.println(hm.containsKey("India"));// true
        // System.out.println(hm.containsKey("Indonesia"));// false

        // System.out.println(hm.remove("India")); // removes entire key value pair and
        // return the value

        // size

        // System.out.println(hm.size());

        hm.clear(); // clears the entire hashmap and makes it clear and empty

        System.out.println(hm.isEmpty());

    }
}
