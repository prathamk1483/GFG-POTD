class Solution {
    private Node reverse(Node head){
        Node prev = null, temp = head;
        while(temp!= null){
            Node t = temp.next;
            temp.next = prev;
            prev = temp;
            temp = t;
        }
        return prev;
    }
    boolean isPalindrome(Node head) {
        Node slow = head , fast = head;
        while(fast.next!= null &&  fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node nexthead = slow.next;
        slow.next = reverse(slow.next);
        slow = slow.next;
        while(slow!=null){
            if(slow.data != head.data) return false;
            head = head.next;
            slow = slow.next;
        }

        return true;
    }
}
