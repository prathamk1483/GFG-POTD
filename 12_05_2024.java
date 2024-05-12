// Recursion Code



// User function Template for Java

class Solution {
    private static int helper(int d,int step,int cur){
        step = Math.abs(step);
        if(cur == d){
            return step-1;
        }
        if(cur > d){
            return Integer.MAX_VALUE;
        }
        if(cur < -d) return Integer.MAX_VALUE;
        return Math.min( helper( d,step+1 ,cur-step) , helper(d,step+1,cur+step) );
    }
    static int minSteps(int d) {
        int step =1;
        
        return helper( d,step,0 );
    }
}
