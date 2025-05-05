import java.util.PriorityQueue;

public class D_KthLargest {

    public static int KthLargest(int num[], int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < num.length; i++) {
            pq.add(num[i]);
            if (pq.size() > K) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int num[] = { 3, 2, 1, 5, 6, 4 };
        int K = 2; // OUTPUT=5
        System.out.println(KthLargest(num, K));
        ;

    }

}
