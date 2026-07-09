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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(temp1 != null || temp2 != null ){
            int a = (temp1 != null)?temp1.val : 0;
            int b = (temp2 != null)?temp2.val : 0;
            int c = a + b + carry;
            if(c > 9){
                carry = 1;
            }else{
                carry = 0;
            }
            
            
            tail.next = new ListNode(c%10);
            tail = tail.next;

            temp1 = (temp1 != null)?temp1.next : null;
            temp2 = (temp2 != null)?temp2.next : null;
        }

        if(carry == 1){
            tail.next = new ListNode(1);
            tail = tail.next;
        }

        return dummy.next;
    }
}
