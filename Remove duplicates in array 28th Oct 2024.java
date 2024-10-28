class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        boolean visited[] = new boolean[100];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: arr){
            if(!visited[i]) ans.add(i);
            visited[i] = true;
        }
        return ans;
    }
}
