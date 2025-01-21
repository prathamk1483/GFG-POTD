class Solution {
    public static Node reverse(Node head){
        Node prev = null , curr = head;
        
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static Node reverseKGroup(Node head, int k) {
        Node a = head;
        Node b = head;
        Node res = new Node(-1);
        Node ans = res;
        
        if(head == null || head.next == null) return head;
        while(b != null){
            int size = 1;
            while(size != k && b.next != null){
                b = b.next;
                size++;
            }
            Node nextNode = b != null ? b.next : null;
            b.next = null;
            res.next = reverse(a);
            res = a;
            a = nextNode; b = nextNode ; 
        }
        
        return ans.next;
    }
}
