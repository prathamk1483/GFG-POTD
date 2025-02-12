class Solution {
    public void inOrder(Node root,List<Integer> arr){
        if(root == null) return;
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);
    }
    public int kthSmallest(Node root, int k) {
        List<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        return arr.size() >= k ? arr.get(k-1) :-1;
    }
}
