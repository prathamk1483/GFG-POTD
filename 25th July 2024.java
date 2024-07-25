class Solution {
    private Node helper(int nums[],int s,int e){
        if(s>e) return null;
        else if(s==e) return new Node(nums[s]);
        int mid = s+(e-s)/2;
        Node root = new Node(nums[mid]);
        root.left = helper(nums,s,mid-1);
        root.right =helper(nums,mid+1,e);
        
        return root;
    }
    public Node sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        else if(nums.length == 1) return new Node(nums[0]);
        
        int s = 0,e = nums.length-1;
        return helper(nums,s,e);
    }
}
