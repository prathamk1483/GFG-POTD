class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int i=0,j=arr.length-1;
        while(i <= j){
            if(i == j){
                ans.add(arr[i++]);
            }
            else{ 
                ans.add(arr[j--]);
                ans.add(arr[i++]);
            }
        }
        return ans;
    }
}
