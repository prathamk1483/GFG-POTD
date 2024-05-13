class Solution {
    private static void dfs(ArrayList<Integer> graph[],int start,boolean[] visited,List<Integer> temp){
        visited[start] = true;
        
        for(int i:graph[start]){
            if(!visited[i]){
                temp.add(i);
                dfs(graph,i,visited,temp);
            }
        }
    }
    public static int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        ArrayList<Integer> graph[] = new ArrayList[v+1];
        for(int i = 0 ;i<=v;i++) graph[i] = new ArrayList<>();
        
        for(int[] i : edges){
            int u = i[0];
            int V = i[1];
            graph[u].add(V);
            graph[V].add(u);
        }
        
        boolean[] visited = new boolean[v+1];
        visited[0] = true;
        List<List<Integer>> subgraphs = new ArrayList<>();
        int count=0;
        for(int i=1;i<=v;i++){
            List<Integer> temp = new ArrayList<>();
            if(!visited[i]){
                temp.add(i);
                dfs(graph,i,visited,temp);
                subgraphs.add(temp);
            }
        }
        for(List<Integer> i:subgraphs){
            int size = i.size()-1;
            boolean flag = false;
            for(int j:i){
                if(graph[j].size() != size){
                    flag = false;
                    break;
                }
                else flag = true;
            }
            count += flag ? 1:0;
        }
        return count;
    }
}
