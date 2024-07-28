class Solution {
    String removeDups(String str) {
        boolean visited[] = new boolean[26];
        StringBuilder ans = new StringBuilder();
        for(char i:str.toCharArray()){
            if(!visited[i-'a']) ans.append(i);
            visited[i-'a'] = true;
        }
        return ans.toString();
    }
}
