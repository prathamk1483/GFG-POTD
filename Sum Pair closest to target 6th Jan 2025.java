class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int maxdif = Integer.MAX_VALUE;
        int i = 0, j = arr.length - 1;
        int a = -1, b = -1;

        if (arr.length < 2) return new ArrayList<>(); 

        while (i < j) {
            int sum = arr[i] + arr[j];
            int curr = Math.abs(sum - target);

            if (curr < maxdif) { r
                a = arr[i];
                b = arr[j];
                maxdif = curr;
            }

            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else { 
                return Arrays.asList(arr[i], arr[j]);
            }
        }

        return Arrays.asList(a, b);
    }
}
