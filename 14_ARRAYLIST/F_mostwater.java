// // -------------------BRUTE FORCE---------------------

// // import java.util.*;

// // public class F_mostwater {

// //     public static int MaxWater(ArrayList<Integer> list) {
// //         int maxwater = 0;

// //         for (int i = 0; i < list.size(); i++) {
// //             for (int j = i + 1; j < list.size(); j++) {

// //                 int height = Math.min(list.get(i), list.get(j));
// //                 int width = j - i;
// //                 int currWater = height * width;
// //                 maxwater = Math.max(maxwater, currWater);

// //             }
// //         }
// //         return maxwater;
// //     }

// //     public static void main(String args[]) {
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(1);
// //         list.add(8);
// //         list.add(6);
// //         list.add(2);
// //         list.add(5);
// //         list.add(4);
// //         list.add(8);
// //         list.add(3);
// //         list.add(7);

// //         System.out.println(MaxWater(list));

// //     }

// // }

// // -------------------------------------------------------------------------------------------------------------------------------------------------
// // OPTIMIZED SOLUTION ( 0(N))  --- 2 POINTER APPROACH

import java.util.*;

public class F_mostwater {

    public static int most(ArrayList<Integer> list) {

        int MaxWater = 0;
        int lp = 0;
        int hp = list.size() - 1;
        while (lp < hp) {
            int height = Math.min(list.get(hp), list.get(lp));
            int width = hp - lp;
            int currWater = height * width;
            MaxWater = Math.max(currWater, MaxWater);
            if (list.get(lp) < list.get(hp)) {
                lp++;
            } else {
                hp--;
            }

        }
        return MaxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(5);
       
        // System.out.println(list); 

        System.out.println(most(list));
    }
}

//-------------------------------------------------------------------------------------------------------------------------
