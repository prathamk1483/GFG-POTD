class Solution {
    public int maxStep(int arr[]) {
        int ans = 0 ,count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] < arr[i]){
                count++;
            }
            else count =0;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
