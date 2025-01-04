class Solution {
    public int countTriplets(int[] arr, int target) {
        int res = 0;
        for (int i = 0; i < arr.length-2; i++) {
            int left = i+1;
            int right = arr.length-1;
            while (left < right) {
                int sum = arr[i] + arr[left] +arr[right];
                if (sum > target) {
                    right-=1;
                } else if(sum < target) {
                    left += 1;
                } else if(sum == target) {
                    int ele1 = arr[left];
                    int ele2 = arr[right];
                    int cnt1 = 0;
                    int cnt2 = 0;
                    while (left <= right && ele1 == arr[left]) {
                        cnt1++;
                        left++;
                    }
                    while (left <= right && ele2 == arr[right]) {
                        cnt2++;
                        right--;
                    }
                    if (ele1==ele2) {
                        res += (cnt1 * (cnt1-1))/2;
                    } else {
                        res += (cnt1*cnt2);
                    }
                }
            }
        }
        return res;
    }
}
