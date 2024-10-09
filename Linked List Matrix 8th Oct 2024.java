class Solution {
    static Node construct(int arr[][]) {
        int n = arr.length;
        Node[][] mat = new Node[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = new Node(arr[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j < n-1)mat[i][j].right = mat[i][j+1];
                if(i < n-1)mat[i][j].down = mat[i+1][j];
            }
        }
        return mat[0][0];
    }
}
