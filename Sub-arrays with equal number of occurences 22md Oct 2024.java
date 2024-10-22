class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        
        diffMap.put(0, 1);
        
        int diff = 0;
        int count = 0;

        for (int num : arr) {
            if (num == x) {
                diff++;
            } else if (num == y) {
                diff--;
            }

            if (diffMap.containsKey(diff)) {
                count += diffMap.get(diff); 
            }

            diffMap.put(diff, diffMap.getOrDefault(diff, 0) + 1);
        }
        
        return count;
    }
}
