class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        int helper[] = new int[height.length];
        helper[0] = height[0];
        int ans = 1;
        for(int i=1;i<height.length;i++){
            helper[i] = Math.max(helper[i-1] ,height[i]);
            if(helper[i] > helper[i-1]) ans++;
        }
        return ans;
    }
}
