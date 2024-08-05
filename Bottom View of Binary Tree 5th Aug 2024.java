class Solution
{
   public class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {

        Node ptr = root;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ptr, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node nd = p.node;
            int h = p.hd;

            map.put(h, nd.data);

            if(nd.left != null){
                q.add(new Pair(nd.left, h-1));
            }
            if(nd.right != null){
                q.add(new Pair(nd.right, h+1));
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> hm : map.entrySet()){
            int a = hm.getValue();
            ans.add(a);
        }

        return ans;
        
    }
}
