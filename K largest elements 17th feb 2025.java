class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: arr) pq.offer(i);
        while(k-- > 0){
            ans.add(pq.remove());
        }
        return ans;
        
    }
}
