class Solution {
    public boolean findTriplet(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for(int i : arr) s.add(i);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(s.contains(arr[i] + arr[j])) return true;
            }
        }
        return false;
    }
}
