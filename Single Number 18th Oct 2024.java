class Solution {
    int getSingle(int arr[]) {
        Map<Integer , Boolean> m = new HashMap<>();
        for(int i: arr){
            if(m.get(i) != null){
                boolean res = m.get(i) == false ? true : false;
                m.put(i,res);
            }
            else m.put(i,true);
        }
        for(int i: arr){
            if(m.get(i)) return i;
        }
        return -1;
    }
}
