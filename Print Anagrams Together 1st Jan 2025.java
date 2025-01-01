class Solution {
    private boolean isAnagramOf(String a , int[] c,String b){
        int[] count = new int[26];
            
        for(char j : b.toCharArray()){
            count[j-'a']++;
        }
        for(int i= 0 ;i<26;i++){
            if(count[i] != c[i]) return false;
        }
        return true;
    }
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
        Set<ArrayList<String>> ans = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            int[] count = new int[26];
            
            for(char j : arr[i].toCharArray()){
                count[j-'a']++;
            }
            ArrayList<String> temp = new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                String t = arr[j];
                if(isAnagramOf(arr[i],count,arr[j])){
                    temp.add(arr[j]);
                }
            }
            ans.add(temp);
        }
        
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(ArrayList<String> i: ans){
            res.add(i);
        }
        
        return res;
    }
}
