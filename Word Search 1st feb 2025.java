class Solution {
    static private boolean search(int i,int j,char[][] mat , String word,int idx,boolean visited[][]){
        if(idx >= word.length()) return true;
        if(i <0 || i >= mat.length || j < 0 || j >= mat[0].length) return false;
        if(visited[i][j]) return false;
        visited[i][j] = true;
        boolean ans = false;
        if(mat[i][j] == word.charAt(idx)){
            ans = search(i-1,j,mat,word,idx+1,visited) ||
            search(i+1,j,mat,word,idx+1,visited) ||
            search(i,j-1,mat,word,idx+1,visited) ||
            search(i,j+1,mat,word,idx+1,visited);
        }
        visited[i][j] = false;
        return ans;
    }
    static public boolean isWordExist(char[][] mat, String word) {
        boolean visited[][] = new boolean[mat.length][mat[0].length];
        for(int i = 0 ;i< mat.length;i++){
            for(int j = 0 ;j<mat[0].length;j++){
                boolean ans = search(i,j,mat,word,0,visited);
                if(ans) return ans;
            }
        }
        return false;
    }
}
