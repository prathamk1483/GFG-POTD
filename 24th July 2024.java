class Solution {
    boolean helper(Node root,long max,long min){
        if(root == null) return true;
        if(root.data >= max || root.data <= min) return false;
        return helper(root.left,root.data,min) && helper(root.right,max,root.data);
    }
    boolean isBST(Node root) {
        return helper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
}
