class Solution {
    public static int pairsum(int[] arr) {
        int l = Integer.MIN_VALUE , sl = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > l){
                sl = l;
                l = i;
            }
            else if(i > sl){
                sl = Math.max(i,sl);
            }
        }
        return  l + sl;
    }
}
