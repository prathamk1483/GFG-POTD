class Solution {
    // Function to return a list of integers denoting the node
    private void helper(Node root , List<Integer> ans){
        if(root == null) return ;
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
        return;
    }
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> ans = new ArrayList<>();
        
        helper(root1,ans);
        helper(root2,ans);
        
        Collections.sort(ans);
        
        return ans;
    }
}
