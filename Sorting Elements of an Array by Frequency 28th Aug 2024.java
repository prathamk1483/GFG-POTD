class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        
        ArrayList<Integer> keyList = new ArrayList<>(m.keySet());
        Collections.sort(keyList, (a, b) -> {
            int freqCompare = m.get(b).compareTo(m.get(a));
            if (freqCompare == 0) {
                return a.compareTo(b); 
            }
            return freqCompare;
        });

        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i : keyList) {
            for (int j = 0; j < m.get(i); j++) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}
