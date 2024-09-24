class Solution
{
    public static String smallestWindow(String s, String p)
    {
        int counter[] = new int[256];
        for(char i : p.toCharArray()) counter[i]++;
        int l = 0, r = 0, minLen = Integer.MAX_VALUE;
        int sind = -1, cnt = 0;
        while(r < s.length()) {
            if(counter[s.charAt(r)] > 0) cnt++;
            counter[s.charAt(r)]--;
            while(cnt == p.length()) {
                if(r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sind = l;
                }
                counter[s.charAt(l)]++;
                if(counter[s.charAt(l)] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return sind == -1 ? "-1" : s.substring(sind, sind + minLen);
    }
}
