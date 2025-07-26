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
class Solution {
    public boolean isPalindrome(ListNode head) {
        //find the mid value
         ListNode slow=head,fast=head;
         while(fast!=null && fast.next!=null)
         {
            fast=fast.next.next;
            slow=slow.next;
         }
         //reverse the second half save in the pre
         ListNode cur=slow,next,pre=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        //compare head and reverse list
        ListNode p1 = head;
        ListNode p2 = pre;
        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}