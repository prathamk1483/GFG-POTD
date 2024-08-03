
class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int top =0,bottom = mat.length-1;
        
        while(top < bottom){
            if(mat[top][bottom] == 1) top++;
            else if(mat[bottom][top] == 1) bottom--;
            else{
                top++;
                bottom--;
            }
        }
        if(top > bottom) return -1;
        for(int i=0;i<mat[0].length;i++){
            if(i == top) continue;
            if(mat[top][i] == 0 && mat[i][top] == 1) continue;
            else return -1;
        }
        return top;
    }
}
