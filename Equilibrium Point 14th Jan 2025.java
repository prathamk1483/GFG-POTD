class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum =0;
        for(int c:arr)
        sum+=c;
        int l=0;
        for(int i=0;i<arr.length;i++){
            int temp =arr[i];
            sum-=temp;
            if(sum==l){
                return i;
            }else{
                l+=temp;
            }
        }
        return -1;
    }
}
