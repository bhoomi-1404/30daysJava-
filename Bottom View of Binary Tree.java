class Solution
{
    //Function to return a list containing the bottom view of the given tree.  public static class Pair{
          public static class Pair{
        Node node=null;
        int hd=0;
        public Pair(Node node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
         ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Node> hm=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        if(root==null)
        {
            return ans;
        }
        q.add(new Pair(root,0));
        int min=0;
        int max=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size!=0)
            {
            Pair front=q.poll();
            min=Math.min(min,front.hd);
            max=Math.max(max,front.hd);
            
                hm.put(front.hd,front.node );
            
            if(front.node.left!=null)
            {
                q.add(new Pair(front.node.left,front.hd-1));
            }
            if(front.node.right!=null)
            {
                q.add(new Pair(front.node.right,front.hd+1));
            }
            size--;
            }
        }
        for(int i=min;i<=max;i++)
        {
            ans.add((Integer) hm.get(i).data);
        }
        return ans;
    }
}
