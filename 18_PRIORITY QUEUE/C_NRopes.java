import java.util.PriorityQueue;

public class C_NRopes {

    public static int Ropes(int ropes[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);

        }
        int cost = 0;

        while (pq.size() > 1) {

            int FirstRope = pq.poll();
            int SecondRope = pq.poll();
            cost += FirstRope + SecondRope;
            int FinalRope = FirstRope + SecondRope;

            pq.add(FinalRope);
        }

        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = { 4, 3, 2, 6 };
        System.out.println(Ropes(ropes));
        ;

    }

}
