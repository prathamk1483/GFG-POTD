class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<k;i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
        }
        ans.add(max);
        for(int i=k;i<arr.length;i++){
            if(idx + k == i){
                max = Integer.MIN_VALUE;
                for(int j =i-k+1;j<=i;j++){
                    if(arr[j] > max){
                        max = arr[j];
                        idx = j;
                    }
                }
            }
            else if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
            ans.add(max);
        }
        return ans;
    }
}
