class Solution {
    private boolean isSafe(boolean visited[][],int[][] mat,int i,int j){
        if(i >=0 && i <mat.length && j >= 0 && j < mat[0].length){
            if(!visited[i][j] && mat[i][j] != 0) return true;
            return false;
        }
        return false;
    }
    private void helper(ArrayList<String> ans,int[][] mat,boolean visited[][] , int i,int j,String cur){
        if(i == mat.length-1 && j == mat[0].length-1){
            ans.add(cur);
        }
        if(isSafe(visited,mat,i+1,j)){
            visited[i][j] = true;
            helper(ans,mat,visited,i+1,j,cur+'D');
            visited[i][j] = false;
        }
        if(isSafe(visited,mat,i-1,j)){
            visited[i][j] = true;
            helper(ans,mat,visited,i-1,j,cur+'U');
            visited[i][j] = false;
        }
        if(isSafe(visited,mat,i,j+1)){
            visited[i][j] = true;
            helper(ans,mat,visited,i,j+1,cur+'R');
            visited[i][j] = false;
        }
        if(isSafe(visited,mat,i,j-1)){
            visited[i][j] = true;
            helper(ans,mat,visited,i,j-1,cur+'L');
            visited[i][j] = false;
        }
        return;
    }
    public ArrayList<String> findPath(int[][] mat) {
        if(mat[0][0] == 0) return new ArrayList<>();
        boolean visited[][] = new boolean[mat.length][mat[0].length];
        ArrayList<String> ans = new ArrayList<>();
        helper(ans,mat,visited,0,0,"");
        return ans;
    }
}
