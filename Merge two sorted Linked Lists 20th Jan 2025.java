class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node temp = new Node(-1);
        Node ans = temp;
        
        while(head1!= null && head2!=null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 != null) temp.next = head1;
        else temp.next = head2;
        
        return ans.next;
        
    }
}
