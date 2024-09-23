/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head == NULL)
    {
        return NULL;
    }
    struct ListNode* it = head->next;  
    struct ListNode* curr = head; 
    while(it != NULL)
    {
        if(it->val != curr->val)
        {
            curr->next = it;
            curr = curr->next;
        }
        it = it->next;
    }
    curr->next = NULL;
    return head;

}