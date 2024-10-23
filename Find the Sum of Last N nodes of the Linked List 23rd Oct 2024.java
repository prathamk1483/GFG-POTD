class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int start = size-n;
        while(start-- > 0){
            temp = temp.next;
        }
        
        int sum = 0;
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        
        return sum;
    }
}
