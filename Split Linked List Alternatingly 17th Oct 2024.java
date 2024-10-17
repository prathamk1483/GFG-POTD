class Solution {
    Node[] alternatingSplitList(Node head) {
        Node t1 = head , t2 = head.next != null ? head.next : null;
        Node a1 = new Node(-1) , a2 = new Node(-1);
        Node ans1 = a1, ans2 = a2;
        while(t1 != null){
            a1.next = new Node(t1.data);
            a1 = a1.next;
            t1 = t1.next != null ? t1.next.next : null;
        }
        while(t2 != null){
            a2.next = new Node(t2.data);
            a2 = a2.next;
            t2 = t2.next != null ? t2.next.next : null;
        }
        
        return new Node[] {ans1.next , ans2.next};
    }
}
