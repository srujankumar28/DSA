// import java.util.*;

// public class M_PriorityQabsic {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         pq.add(5);
//         pq.add(-11);
//         pq.add(3);
//         System.out.println(pq.peek());
//         System.out.println(pq.poll());
//         System.out.println(pq.peek());

//     }

// }

import java.util.*;

public class A_Basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(-11);
        pq.add(3);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }

}

