class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
       int size = 0;
       while(head != null){
           head = head.next;
           size++;
       }
       return size;
    }
}
