class Solution {
    private int helper(String s1,String s2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j <0)return i+1;
        
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return helper(s1,s2,i-1,j-1,dp);

        int delete = 1 + helper(s1, s2, i - 1, j,dp);
        int replace = 1 + helper(s1, s2, i - 1, j - 1,dp);
        int insert = 1 + helper(s1, s2, i, j - 1,dp);

        return dp[i][j]= Math.min(delete, Math.min(replace, insert));
        
    }
    public int editDistance(String str1, String str2) {
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        
        return helper(str1,str2,str1.length()-1,str2.length()-1,dp);
    }
}


// OR 


class Solution {
    public int editDistance(String str1, String str2) {
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        
        int n = str1.length();
        int m = str2.length();
        
        for(int i=0;i<=n;i++) dp[i][0] = i;
        for(int j=0;j<=m;j++) dp[0][j] = j;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else{
                    int del = 1 + dp[i-1][j];
                    int rep = 1 + dp[i-1][j-1];
                    int ins = 1 + dp[i][j-1];
                    
                    dp[i][j] = Math.min( del, Math.min(rep,ins) );
                }
            }
        }
        return dp[n][m];
    }
}
