// LEETCODE SOLUTION IS PASTED HERE 

// PLS CHECK THE LEETCODE FOR THE SOLUTION


  
  
 
public class IntersectionLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
// --------------------------------------------------------------------------------------------------------------------------------------------------
    public int getSize(ListNode head){
        int counter=0;
        ListNode curr= head;
        while(curr!=null){
            counter++;
            curr=curr.next;
        }
        return counter;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA= getSize(headA);
        int sizeB=getSize(headB);
        while(sizeA>sizeB){
            headA=headA.next;
            sizeA--;
        }
         while(sizeB>sizeA){
            headB=headB.next;
            sizeB--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

        
    }

}