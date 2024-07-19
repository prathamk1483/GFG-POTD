class Solution {
    public int binarySearch(int x,ArrayList<Integer> v) {
        int l = 0, h = v.size() - 1, mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (v.get(mid) == x) return mid;
            else if (v.get(mid) > x) h = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
    int[] constructLowerArray(int[] arr) {
        ArrayList<Integer> helper = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++) helper.add(arr[i]);
        Collections.sort(helper);
        
        int[] t = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int pos = binarySearch(key,helper);
            while(pos > 0 && helper.get(pos - 1).equals(helper.get(pos))) pos--;
            t[i] = pos;
            helper.remove(pos);
        }
        return t;
    }
}
