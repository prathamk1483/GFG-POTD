class Solution {
    public String smallestNumber(int s, int d) {
        if (s > 9 * d) {
            return "-1";
        }
        int[] result = new int[d];

        for (int i = d - 1; i >= 0; i--) {
            if (s > 9) {
                result[i] = 9;
                s -= 9;
            } else {
                result[i] = s;
                s = 0;
            }
        }
        for (int i = 0; i < d; i++) {
            if (result[i] > 0) {
                result[i] -= 1;
                result[0] += 1;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }

        return sb.toString();
    }
}
