class Solution{
    static boolean isBST(Node root, long minVal, long maxVal){
        if (root == null) return true;
        if (root.data >= maxVal || root.data <= minVal) return false;
        return isBST(root.left, minVal, root.data) && isBST(root.right, root.data, maxVal);
    }
    static int helper(Node root){
        if(root == null) return 0;
        if(root.right == null && root.left == null) return 1;
        boolean BST = isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        int left = helper(root.left);
        int right = helper(root.right);
        
        if(BST) return 1+ left+right;
        return Math.max(left,right);
    }
    static int largestBst(Node root)
    {
        return helper(root);
    }
    
}
