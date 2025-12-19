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
    public ListNode half(ListNode head)
    {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode h)
    {
        ListNode pre=null;
        while(h!=null)
        {
            ListNode next=h.next;
            h.next=pre;
            pre=h;
            h=next;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode f=head,s=head;
        s=half(head);
        s=reverse(s);
        while(s!=null)
        {
            if(f.val!=s.val)return false;
            f=f.next;
            s=s.next;
        }
        return true;
    }
}