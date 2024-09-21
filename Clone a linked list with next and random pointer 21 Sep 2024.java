class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        Map<Node , Node> m = new HashMap<>();
        Node ans = new Node(-1);
        Node res = ans;
        Node temp = head;
        
        while(temp!= null){
            ans.next = new Node(temp.data);
            ans = ans.next;
            m.put(temp , ans);
            temp = temp.next;
        }
        temp = head;
        ans = res.next;
        while(temp != null){
            ans.random = m.get(temp.random);
            ans = ans.next;
            temp = temp.next;
        }
        return res.next;
    }
}
