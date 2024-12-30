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
    public ListNode addNode(ListNode tail, int value) {
        tail.next = new ListNode(value); 
        return tail.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // Dummy node to simplify list creation
        ListNode tail = dummy; // Pointer to the last node in the new list

        // Merge nodes from both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail = addNode(tail, list1.val);
                list1 = list1.next;
            } else {
                tail = addNode(tail, list2.val);
                list2 = list2.next;
            }
        }

        // Add remaining nodes from list1 or list2
        while (list1 != null) {
            tail = addNode(tail, list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            tail = addNode(tail, list2.val);
            list2 = list2.next;
        }

        return dummy.next; // Skip the dummy node and return the merged list
    }
}