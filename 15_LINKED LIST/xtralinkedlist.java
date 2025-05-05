import java.util.List;

public class xtralinkedlist {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // DISPLAYING THE NODES OF THE SINGLY LISTED LIST

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // FINDING THE LENGTH OF THE SINGLY LISTED LIST

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;

    }

    // INSERTING THE NODE AT THE BEGINING OF THE SINGLTY LISTED LIST

    public void insertfirst(int value) {
        ListNode newNode = new ListNode(21);
        newNode.next = head;
        head = newNode;

    }

    // INSERTING THE NODE AT THE END OF THE SINGLT LISTED LIST

    public void insertlast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {

            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    // INSERTING THE NODE AT THE GIVEN POSITION

    public void insert(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current =previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }
   
    // DELETE THE FIRST NODE OF THE SINGLY LINKED LIST

    public ListNode deleteFirst(){
        if(head==null){
            return null;

        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    public ListNode reverse(ListNode hNode){
        if(head==null){
            return head;
        }
        ListNode current = head;
        ListNode previous=null;
        ListNode next=null;

        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;

        }
        return previous;
    }

    public static void main(String[] args) {
        xtralinkedlist ll= new xtralinkedlist();
        ll.head=new ListNode(10);

        ListNode second=new ListNode(15);
        ListNode third=new ListNode(12);
        ListNode fourth = new ListNode(20);
        ll.head.next=second;
        second.next=third;
        third.next=fourth;
        ListNode reverseHead=ll.reverse(head);
        ll.display(reverseHead);
        

        

    }

}
