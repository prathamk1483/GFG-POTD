class Solution {
    String reverseWords(String str) {
        Stack<String> l = new Stack<>();
        
        int i=0,j=0;
        while(j < str.length()){
            if(str.charAt(j) == '.'){
                l.push(str.substring(i,j));
                i = j+1 <str.length() ? j+1 : j;
            }
            j++;
        }
        l.push(str.substring(i,j));
        StringBuilder ans = new StringBuilder();
        i=0;
        while(!l.isEmpty()){
            ans.append(l.pop());
            ans.append('.');
        }
        return ans.toString().substring(0,ans.length()-1);
    }
}
