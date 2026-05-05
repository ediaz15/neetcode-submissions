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
    public ListNode reverseList(ListNode head) {
        if((head == null)|| (head.next == null)){
            return head;
        }
        //point to head
        //setup a next pointer
        //flip that pointer.next to pointer.prev
        //so if we iterate through the list then we get the next node, the current node, and the previous node
        //prev -> current -> next
        //current.next = prev
        //prev = current
        //current = temp;
        //prev <- current <- next;
        //the final node (prev) should be returned as it would be the new head of the linked list
        ListNode current = head;
        ListNode prev = null;
        ListNode temp = null;
        while(current != null){
            //temp variable to store the next node
            temp = current.next;
            //set current pointer to previous node
            current.next = prev;
            //update previous node pointer to current
            prev = current;
            //set current node to next (to iterate forward)
            current = temp;
        }
        return prev;
    }  
}
