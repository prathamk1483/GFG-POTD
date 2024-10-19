class Solution {

    String roundToNearest(String str) {
        
        String ans="0";
        int a=str.charAt(str.length()-1)-'0';
        if(a<=5) return str.substring(0,str.length()-1)+"0";
        else{
            int carry=1;
            for(int i=str.length()-2;i>=0;i--){
                if(str.charAt(i)=='9') ans="0"+ans;
                else {
                    ans=""+((str.charAt(i)-'0')+1)+ans;
                    return str.substring(0,i)+ans;
                    
                }
            }
        }
        return "1"+ans;
    }
}
