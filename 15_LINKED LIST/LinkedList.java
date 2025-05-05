public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFisrt(int data) {
        // step 1= create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2- newnode next = head
        newNode.next = head;

        // step3= head=newNode
        head = newNode;

    }

    public static void addlast(int data) {
        // step 1= create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2- newnode next = head
        tail.next = newNode;

        // step3= head=newNode
        tail = newNode;

    }

    public void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void add(int idx, int data) {
        // ADD AT THE MIDDLE
        if (idx == 0) {
            addFisrt(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i= idx-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data; // prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // key not found
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;

        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    // public void reverse() {
    // if (head == null || head.next == null) {
    // return;

    // }

    // Node prevNode = head;
    // Node currNode = head.next;
    // Node nextNode;

    // while (currNode != null) {
    // nextNode = currNode.next;
    // currNode.next = prevNode;

    // // update
    // prevNode = currNode;
    // currNode = nextNode;

    // }
    // head.next = null;
    // head = prevNode;

    // }

    public void deleteNthNode(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

        }

        if (n == sz) { // remove head-> remove first element
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // PALINDROME
    // slow fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midnode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step -1 find Mid
        Node miNode = findMid(head);

        // step 2- reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev; // right half head
        Node left = head;

        // step 3- check left half and right half

        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove the cycle --> last.next-> null
        prev.next = null;

    }

    // -------------------------------------------------------------------------------------------------------------------------------
    // MERGE SORT IN LINKED LIST

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midnode
    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergeLL.next;

    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left right MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        // merge
        return merge(newLeft, newRight);
    }

    // ----------------------------------------------------------------------------------------------------------------------------------------
    // ZIG ZAG LINKED LIST
    public void ZigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        // step 3 zig zag
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;

        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ll.addFisrt(2);
        // ll.addFisrt(1);
        // // ll.addFisrt(3);
        // // ll.addFisrt(0);
        // // ll.addFisrt(9);
        // ll.addlast(2);
        // ll.addlast(1);

        // // // ll.add(2, 3);
        // // ll.print();
        // // ll.removeFirst();
        // // ll.print();
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println(ll.size);

        // // System.out.println(ll.itrSearch(10));
        // // System.out.println(ll.itrSearch(0));

        // // System.out.println(ll.recSearch(10));
        // // System.out.println(ll.recSearch(0));
        // ll.print();
        // // ll.reverse();
        // // ll.print();
        // // ll.deleteNthNode(3);
        // System.out.println(ll.checkPalindrome());

        // // for checking isCycle function
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head;
        // // 1-> 2-> 3->1 (froms cycle LL)

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp; // 1->2->3->2
        // System.out.println(isCycle()); // true
        // removeCycle();
        // System.out.println(isCycle()); // false

        // MERGE SORT FUNCTION
        ll.addFisrt(1);
        ll.addFisrt(2);
        ll.addFisrt(3);
        ll.addFisrt(4);
        ll.addFisrt(5);
        ll.print();
        ll.ZigZag();
        ll.print();

        // ll.head= ll.mergeSort(head);
        // ll.print();

    }

}