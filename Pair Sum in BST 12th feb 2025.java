class Solution {
    void inorder(Node root,Map<Integer,Boolean> mp ,boolean ans[],int target){
        if(root == null) return ;
        inorder(root.left,mp,ans,target);
        if(mp.containsKey(target-root.data)){
            ans[0] = true;
            return;
        }
        mp.put(root.data,true);
        inorder(root.right,mp,ans,target);
        return;
    }
    boolean findTarget(Node root, int target) {
        Map<Integer,Boolean> mp = new HashMap<>();
        boolean ans[] = new boolean[1];
        inorder(root,mp,ans,target);
        return ans[0];
    }
}
