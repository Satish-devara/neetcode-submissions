/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node, Node> mpp = new HashMap<>();

        Node temp = head;
        while(temp != null){
           mpp.put(temp, new Node(temp.val));
           temp = temp.next;
        }

        temp = head;
        while(temp != null){
            Node copy = mpp.get(temp);
            copy.next = mpp.get(temp.next);
            copy.random = mpp.get(temp.random);

            temp = temp.next;
        }

        return mpp.get(head);
       
    }
}
