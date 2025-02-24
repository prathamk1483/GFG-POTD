class Pair{
    int num;
    int idx;
    Pair(int n , int i){
        num = n;
        idx = i;
    }
}

class Solution {
    
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int a = 1;
            while(!st.isEmpty() && st.peek().num <= arr[i]){
                a += st.peek().idx;
                st.pop();       
            }
            st.push(new Pair(arr[i],a));
            if(ans.size() == 0) ans.add(1);
            else ans.add(a);
        }
        
        return ans;
    }
}
