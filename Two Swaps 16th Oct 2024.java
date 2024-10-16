class Solution {

    public boolean checkSorted(List<Integer> arr) {
        int swaps =0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == i+1) continue;
            else{
                swaps++;
                int a = arr.get(arr.get(i)-1) , b = arr.get(i);
                int temp = arr.get(i)-1;
                arr.set(i , a);
                arr.set(temp ,b);
            }
            if(swaps > 2) return false;
        }
        for(int i =1;i<arr.size();i++){
            if(arr.get(i-1)+1 == arr.get(i)) continue;
            else return false;
        }
        return swaps == 2 || swaps == 0? true :false;
    }
}
