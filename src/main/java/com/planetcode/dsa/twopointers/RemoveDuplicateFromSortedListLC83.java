package com.planetcode.dsa.twopointers;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveDuplicateFromSortedListLC83 {


    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode forward = head.next, previous = head;

        while(forward != null){
            if(previous.val == forward.val){
                forward = forward.next;
            }else{
                previous.next = forward;
                previous = forward;
                forward = forward.next;

            }

        }
        if(previous != null && previous.next != null && previous.val == previous.next.val){
            previous.next = null;
        }
        return head;

    }
}
