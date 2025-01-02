class Solution {
    public int countSubarrays(int arr[], int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int prefix = 0 , cnt = 0 , remove = 0;
        
        mp.put(0,1);
        
        for(int i : arr){
            prefix += i;
            remove = prefix - k;
            cnt += mp.getOrDefault(remove , 0);
            mp.put(prefix, mp.getOrDefault(prefix,0)+1);
        }
        return cnt;
    }
}
