/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 //---------------------LEETCODE PROBLEM * PALINDROME LL *--------------------------------------------------------------------------------------
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> s= new Stack<>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            s.push(curr);
        }

        ListNode left=head, right;

        while(s.size()>0){
            right= s.pop();
            if(left.val!= right.val){
                return false;
            }
            left=left.next;
        }
        return true;
        
    }
}