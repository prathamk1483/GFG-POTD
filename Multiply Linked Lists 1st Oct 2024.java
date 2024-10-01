class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long ans=0;
        long sum1=0;
        long sum2=0;
        long mod=1000000000+7;
        
    
        while(first!=null){
            sum1= sum1*10+first.data;
            first=first.next;
        }
        
        while(second!=null){
            sum2=sum2*10+second.data;
            second=second.next;
        }
        
        ans= (sum1*sum2)%mod;
        
        return ans;
        
    }
}
