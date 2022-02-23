class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList <Integer> ans=new ArrayList<>();
	    if(root==null)
	    {
	        return ans;
	    }
	    Queue<Node> q=new LinkedList<>();
	    q.add(root);
	   boolean leftToRight=true;
	    while(!q.isEmpty())
	    {
	         int size=q.size();
	         ArrayList<Integer> temp=new ArrayList<>();
	         for(int i=0;i<size;i++)
	         {   
	            Node curr=q.poll();
	             if(curr.left!=null)
	             {
	                 q.add(curr.left);
	             }
	             if(curr.right!=null)
	             {
	                 q.add(curr.right);
	             }
	             temp.add(curr.data);
	         }
	         if(leftToRight)
	         {
	             
	             
	         }
	         else
	         {
	             Collections.reverse(temp);
	         }
	         for(int i=0;i<temp.size();i++)
	         {
	             ans.add(temp.get(i));
	         }
	         leftToRight=!(leftToRight);
	    }
	    return ans;
	}
}
