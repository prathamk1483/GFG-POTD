class Solution {
    private void dfs(int r,int c, char[][] grid){
        if(r>=grid.length || r<0 || c>=grid[0].length || c<0 || grid[r][c]=='0' || grid[r][c]=='2') return;
        grid[r][c] = '2';
        dfs(r-1,c,grid);
        dfs(r+1,c,grid);
        dfs(r,c-1,grid);
        dfs(r,c+1,grid);
        dfs(r-1,c-1,grid);
        dfs(r-1,c+1,grid);
        dfs(r+1,c-1,grid);
        dfs(r+1,c+1,grid);
        return;
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
}
