class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        for(char i : x.toCharArray()){
            if(i == '(') s.push(')');
            else if(i == '{') s.push('}');
            else if(i == '[') s.push(']');
            else if(i == ')' || i == '}' || i == ']'){
                if(s.isEmpty() || s.pop() != i) return false; 
            }
        }
        return s.isEmpty();
    }
}
