// //User function Template for Java

// class Solution
// {
//     private int lcs(String s1,String s2,int i,int j,int dp[][] ){
//         if(i == 0 || j == 0 )return 0;
//         if(dp[i][j] != -1) return dp[i][j];
//         if(s1.charAt(i-1) == s2.charAt(j-1)) return dp[i][j] = 1+ lcs(s1,s2,i-1,j-1,dp);
//         return dp[i][j] = Math.max( lcs(s1,s2,i-1,j,dp) , lcs(s1,s2,i,j-1,dp) );
//     }
// 	public int minOperations(String s1, String s2) 
// 	{ 
// 	    int i=0,j=0;
// 	    int dp[][] = new int[s1.length()+1][s2.length()+1];
// 	    for(int k[]:dp) Arrays.fill(k,-1);
// 	    int LCS = lcs(s1,s2,s1.length(),s2.length(),dp);
// 	    return (s1.length()-LCS) + (s2.length()-LCS);
// 	} 
// }

class Solution
{
	public int minOperations(String s1, String s2) 
	{ 
	    int dp[][] = new int[s1.length()+1][s2.length()+1];
	    for(int i=0;i<=s2.length();i++) dp[0][i] = 0;
	    for(int i=0;i<=s1.length();i++) dp[i][0] = 0;
	    
	    for(int i=1;i<=s1.length();i++){
	        for(int j=1;j<=s2.length();j++){
	            if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
	            else dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
	        }
	    }
	    int LCS = dp[s1.length()][s2.length()];
	    return (s1.length()-LCS) + (s2.length()-LCS);
	} 
}
