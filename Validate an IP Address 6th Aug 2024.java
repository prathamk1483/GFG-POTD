class Solution {

    public boolean isValid(String str) {
        StringBuilder a = new StringBuilder(),
                      b = new StringBuilder(),
                      c = new StringBuilder(),
                      d = new StringBuilder();
        
        int count=0;
        
        for(char i : str.toCharArray()){
            if(count == 0 && i != '.') a.append(i);
            else if(count == 1 && i != '.') b.append(i);
            else if(count == 2 && i != '.') c.append(i);
            else if(count == 3 && i != '.') d.append(i);
            else count++;
        }
        
        if(count > 3 || a.length() == 0 || b.length() == 0 || c.length() == 0 || d.length() == 0) return false;
        
        if(Integer.parseInt(a.toString()) < 0 || Integer.parseInt(a.toString()) > 255) return false;
        if(Integer.parseInt(b.toString()) < 0 || Integer.parseInt(b.toString()) > 255) return false;
        if(Integer.parseInt(c.toString()) < 0 || Integer.parseInt(c.toString()) > 255) return false;
        if(Integer.parseInt(d.toString()) < 0 || Integer.parseInt(d.toString()) > 255) return false;
        return true;
    }
}
