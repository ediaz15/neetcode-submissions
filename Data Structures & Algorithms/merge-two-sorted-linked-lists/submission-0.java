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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //pointer to the head of both lists
        //three cases (left < right, left == right, left > right)
        //example case (left < right)
            //ListNode from list 1 < ListNode from List 2
            //current (merged list) = ListNode from List 1
            //move onto the next node in list 1

        //stop until both lists have been traversed

        ListNode newList = new ListNode(0);
        ListNode currentNewList = newList;
        
        while((list1 != null) && (list2 != null)){
            //handling comparisons
            if(list1.val < list2.val){
                currentNewList.next = list1;
                list1 = list1.next;
            } else {
                //currentL1 >= currentL2
                currentNewList.next = list2;
                list2 = list2.next;
            }
            currentNewList = currentNewList.next;
        }


        //if either list is finished, add the rest of the nodes from other list to new list
        if(list1 != null){
            currentNewList.next = list1;
        } else {
            //list != null
            currentNewList.next = list2;
        }
        return newList.next;
    }
}