// class Solution {
//     private boolean helper(int i,int j,String s1,String s2,int[][] dp){
//         if(i<0 && j<0) return true;
//         if(i<0 && j >= 0) return false;
//         if(i>=0 && j < 0){
//             for(int idx =0;idx <= i;idx++){
//                 if(s1.charAt(idx) != '*') return false;
//             }
//             return true;
//         }
//         if(dp[i][j] != -1) return dp[i][j] == 1 ? true:false;
//         if(s1.charAt(i) == s2.charAt(j) || s1.charAt(i) == '?'){ 
//             dp[i][j] = helper(i-1,j-1,s1,s2,dp) == true ? 1:0;
//             return dp[i][j] == 1 ? true :false;
//         }
//         if(s1.charAt(i) == '*'){ 
//             dp[i][j] =( helper(i-1,j,s1,s2,dp) | helper(i,j-1,s1,s2,dp) )== true ? 1:0;
//             return dp[i][j] == 1 ? true:false;
//         }
        
        
//         return false;
//     }
//     public int wildCard(String pattern, String str) {
//         int n = pattern.length();
//         int m = str.length();
//         int dp[][] = new int[n][m];
//         for(int i[] : dp) Arrays.fill(i,-1);
//         return helper(n-1,m-1,pattern,str,dp) ? 1:0;
//     }
// }

class Solution {
    public int wildCard(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        boolean dp[][] = new boolean[n+1][m+1];
        // for(int i[] : dp) Arrays.fill(i,-1);
        dp[0][0] = true;
        for(int j=1;j<=m;j++) dp[0][j] = false;
        for(int i=1;i<=n;i++){
            boolean flag = true;
            for(int idx =1;idx <= i;idx++){
                if(s1.charAt(idx-1) != '*'){
                    flag = false;
                    break;
                }
            }
            dp[i][0] =  flag;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1) || s1.charAt(i-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(s1.charAt(i-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else dp[i][j] = false;
            }
        }
        return dp[n][m] == true ? 1 : 0;
    }
}
