class Solution {
    boolean kPangram(String str, int k) {
        int visited[] = new int[26];
        int t =0;
        for(char i : str.toCharArray()){
            if(i== ' ') continue;
            visited[i-'a']++;
            t++;
        }
        if(t <26) return false;
        int count = 0;
        for(int i:visited){
            if(i != 0) count++;
        }
        return count+k >=26 ? true:false;
    }
}
