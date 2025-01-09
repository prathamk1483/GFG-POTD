class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        
        mp.put(0,-1);
        int prefix = 0;
        for(int i=0;i<arr.length;i++){
            prefix += arr[i];
            int toFind = prefix - target;
            if(toFind == 0){
                ans.add(1);
                ans.add(i+1);
                return ans;
            }
            else if(mp.containsKey(toFind)){
                int idx = mp.get(toFind)+1;
                ans.add(idx+1);
                ans.add(i+1);
                return ans;
            }
            mp.put(prefix,i);
        }
        ans.add(-1);
        return ans;
    }
}
