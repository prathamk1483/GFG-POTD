class Solution {
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                int cdiff = Math.abs(target - sum);
                
                if(sum == target) return target;
                else if(sum > target) k--;
                else j++;
                
                if(cdiff <= diff){
                    if(cdiff==diff)
                        ans=Math.max(ans,sum);
                    else ans=sum;
                    diff = cdiff;
                }
            }
        }
        return ans;
    }
}
