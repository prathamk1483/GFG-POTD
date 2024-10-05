class Solution {
    public long findSmallest(int[] arr) {
        long ans = 1;
        if(arr[0] > 1) return ans;
        for(int i:arr){
            if(i > ans) return ans;
            ans += i;
        }
        return ans;
    }
}
