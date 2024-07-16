class Solution {
    public String printString(String s, char ch, int count) {
        int c =0;
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch) count--;
            if(count == 0){
                ans = s.substring(i+1,s.length());
                break;
            }
        }
        return ans;
    }
}
