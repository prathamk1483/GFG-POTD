class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if (head == null) return null;  // Handle edge case of empty list

        // Min-Heap to store the first k+1 nodes
        PriorityQueue<DLLNode> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Add the first k+1 elements to the priority queue
        DLLNode current = head;
        for (int i = 0; i <= k && current != null; i++) {
            pq.offer(current);
            current = current.next;
        }

        // Initialize the new sorted DLL with a dummy node
        DLLNode dummy = new DLLNode(0);
        DLLNode tail = dummy;

        // Process the remaining nodes and build the sorted list
        while (!pq.isEmpty()) {
            DLLNode smallest = pq.poll();
            tail.next = smallest;
            smallest.prev = tail;
            tail = tail.next;

            // Add the next element from the original list (if any)
            if (current != null) {
                pq.offer(current);
                current = current.next;
            }
        }

        // Ensure the last node's `next` is set to null
        tail.next = null;

        // Return the new head, skipping the dummy node
        DLLNode sortedHead = dummy.next;
        if (sortedHead != null) sortedHead.prev = null;
        return sortedHead;
    }
}
