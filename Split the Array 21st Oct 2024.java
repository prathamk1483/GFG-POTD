class Solution {

    public static int countgroup(int arr[]) {
        int XOR=0;
        for(int el:arr) XOR^=el;
        if(XOR != 0) return 0;
        int ans=1;
        for(int i=0;i<arr.length-1;i++){
            ans=(ans*2)%1000000007;
        }
        return ans-1;
    }
}
