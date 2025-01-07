class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        
        HashMap<Integer,Integer> hs = new HashMap<>();
       
       int ans = 0;
       
       for(int i=0;i<arr.length;i++){
           int diff = target-arr[i];
           
           if(hs.containsKey(arr[i])){
               ans+=hs.get(arr[i]);
           }
           
           hs.put(diff,hs.getOrDefault(diff,0)+1);
       }
        
        return ans;
    }
}
