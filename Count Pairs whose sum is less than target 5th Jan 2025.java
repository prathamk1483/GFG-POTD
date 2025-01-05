class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        // 2 3 5 7 
        // 1 2 2 3 4 5 
        int i=0,j=arr.length-1;
        int count = 0;
        while(i < j){
            if(arr[i] + arr[j] < target){ 
                count+= (j-i);
                i++;
            }
            else if(arr[i] + arr[j] >= target){
                j--;
            }
        }
        
        return count;
    }
}
