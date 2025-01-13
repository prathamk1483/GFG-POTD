class Solution {

    public int maxWater(int arr[]) {
        long ans = Long.MIN_VALUE;
        int i = 0 , j = arr.length-1;
        
        while(i < j){
            int h = Math.min(arr[i],arr[j]);
            int l = j-i;
            
            long area = h*l;
            
            ans = Math.max(area,ans);
            if(arr[i] > arr[j]) j--;
            else i++;
        }
        
        return (int)ans;
    }
}
