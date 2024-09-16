class Solution{
    static int maxLength(String S){
        Stack<Integer> s = new Stack<>();
        int ans =0;
        s.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '('){
                s.push(i);
            }
            else{
                s.pop();
                if(s.isEmpty()) s.push(i);
                else ans = Math.max(ans,i-s.peek());
            }
        }
        return ans;
    }
}
