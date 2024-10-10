class Solution {
    public int maxDistance(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int i : arr) s.add(i);
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i : s) {
            m.put(i, new ArrayList<>());
        }
        for (int i = 0; i < arr.length; i++) {
            m.get(arr[i]).add(i);
        }
        int ans = Integer.MIN_VALUE;
        for (int i : s) {
            ans = Math.max(m.get(i).get(m.get(i).size() - 1) - m.get(i).get(0), ans);
        }
        return ans;
    }
}
