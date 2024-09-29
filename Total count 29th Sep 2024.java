class Solution {
    int totalCount(int k, int[] arr) {
        int ans = 0;
        for(int i:arr){
            if(i %k == 0) ans += i/k;
            else ans += (i/k + 1);
        }
        return ans;
    }
}
