class Solution {
    int lps(String str) {
        int p =0,count = 0,s = 1 , pos = 1,n = str.length();
        int ans = 0;
        while(p < n && s < n){
            if(str.charAt(p) == str.charAt(s)){
                p++;s++;
                count++;
            }
            else{
                p = 0;
                pos++;
                s = pos;
                count =0;
            }
           
        }
        return count;
    }
}
