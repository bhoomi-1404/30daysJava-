class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    static HashMap<Node,Node> hm;
    static int time;
   // static   map;
    
    public static Node createMapping(Node root,HashMap<Node,Node> hm, int target)
    {
        Node res=null;
        Queue <Node> q=new LinkedList<>();
        q.add(root);
        hm.put(root,null);
        while(!q.isEmpty())
        {
            Node front=q.poll();
            if(front.data==target)
            {
                res=front;
            }
            if(front.left!=null)
            {
                q.add(front.left);
                hm.put(front.left,front);
            }
            if(front.right!=null)
            {
                q.add(front.right);
                hm.put(front.right,front);
            }
            
        }
        return res;
    }
   static  int burningTree(Node targetNode,HashMap<Node,Node> hm)
    {
       HashMap<Node,Boolean> map=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(targetNode);
        map.put(targetNode,true);
       int ans=0;
        while(!q.isEmpty())
        {   boolean flag=true;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
            Node front=q.poll();
            if(front.left!=null && map.get(front.left)!=true)
            {
                q.add(front.left);
                map.put(front.left,true);
                flag=true;
            }
             if(front.right!=null && map.get(front.right)!=true)
            {
                q.add(front.right);
                map.put(front.right,true);
                flag=true;
            }
            if(hm.get(front)!=null && map.get(front)!=true)
            {
                q.add(front);
                map.put(front,true);
                flag=true;
            }
            }
            if(flag==true)
            {
                ans++;
            }
        }
        return ans;
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        hm=new HashMap<>();
      //  time=0;
        Node targetNode= createMapping(root,hm,target);
        int ans=burningTree(targetNode,hm);
        return ans;
    }
}
