import java.util.*;

public class J_DequeueJCF {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(2);
        deque.addFirst(1);
        System.out.println(deque);
    }

}
