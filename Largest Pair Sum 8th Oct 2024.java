class Solution {
    public static int pairsum(int[] arr) {
        int l = Integer.MIN_VALUE , sl = Integer.MIN_VALUE;
        for(int i : arr){
            l = Math.max(i,l);
        }
        for(int i : arr){
            if(i > sl && i < l){
                sl = Math.max(i,sl);
            }
        }
        return  l + sl;
    }
}
