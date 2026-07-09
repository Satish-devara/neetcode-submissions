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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
       
        while(fast != null && fast.next != null){
           
            slow = slow.next;
            fast = fast.next.next;
        }

       

        ListNode l1 = head;
        ListNode l2 = slow.next;
        ListNode prev = slow.next = null;

        while(l2 != null){
            ListNode nextPointer = l2.next;
            l2.next = prev;
            prev = l2;
            l2 = nextPointer;
        }

        l2 = prev;

        

        while( l2 != null){
            ListNode nextL1 = l1.next;
            ListNode nextL2 = l2.next;

            l1.next = l2;

            if(nextL1 == null){
                break;
            }

            l2.next = nextL1;

            l1 = nextL1;
            l2 = nextL2;
        }
        
    }
}
