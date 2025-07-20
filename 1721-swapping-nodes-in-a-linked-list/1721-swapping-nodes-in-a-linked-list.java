class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstK = head;
        // Step 1: Find the kth node from the beginning
        for (int i = 1; i < k; i++) {
            firstK = firstK.next;
        }

        ListNode temp = head;
        ListNode secondK = head;
        // Step 2: Move temp k steps ahead
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }

        // Step 3: Move temp to the end, secondK will reach kth from end
        while (temp != null) {
            temp = temp.next;
            secondK = secondK.next;
        }

        // Step 4: Swap values
        int t = firstK.val;
        firstK.val = secondK.val;
        secondK.val = t;

        return head;
    }
}
