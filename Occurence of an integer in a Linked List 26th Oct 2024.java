class Solution {
    public static int count(Node head, int key) {
        int ans = 0;
        while(head != null){
            ans += head.data == key ? 1 : 0;
            head = head.next;
        }
        return ans;
    }
}
