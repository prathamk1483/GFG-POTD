class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int count = 0 , i = arr.length-1;
        while(i>1){
            int st=0;
            int end=i-1;
            while(st<end){
                if(arr[st]+arr[end]>arr[i]){
                    count+=(end-st);
                    end--;
                }
                else st++;
                
            }
            i--;
        }
        return count;
    }
}
