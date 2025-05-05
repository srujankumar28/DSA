import java.util.*;

public class B_LastStoneWeight {

    public static int LastStoneWeight(int stones[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max priority queue
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);

        }

        while (pq.size() > 1) {
            int top = pq.poll();
            int secondTop = pq.poll();
            int Final = top - secondTop;
            if (Final != 0) {
                pq.add(Final);
            }

        }

        if (pq.size() > 0) {
            return pq.peek();
        }
        return 0;
    }

    public static void main(String[] args) {
        int stones[] = { 2, 7, 4, 1, 12, 1 };
        System.out.println(LastStoneWeight(stones));
        ;
    }

}
