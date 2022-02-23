class Solution
{
    
    void traversalLeft(Node node,ArrayList<Integer> ans)
    {
        if((node==null) || (node.left==null && node.right==null))
        {
            return ;
        }
    
        ans.add(node.data);
        if(node.left!=null)
        {
        traversalLeft(node.left,ans);
        }
        else
        {
        traversalLeft(node.right,ans);
        }
    }
    void traversalLeaf(Node node,ArrayList<Integer> ans)
    {
        if(node==null)
        {
            return ;
        }
        if(node.left==null && node.right==null)
        {
            ans.add(node.data);
            return ;
        }
      
        traversalLeaf(node.left,ans);
        traversalLeaf(node.right,ans);
        
    }
    void traversalRight(Node node,ArrayList<Integer> ans)
    {
       if((node==null) || (node.left==null && node.right==null))
        {
            return ;
        }
    
        if(node.right!=null)
        {
             traversalRight(node.right,ans); 
        }
        else{
        traversalRight(node.left,ans);
        }
      
        ans.add(node.data);
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList <Integer> ans =new ArrayList<>();
	    if(node ==null)
	    {
	        return ans;
	    }
	    ans.add(node.data);
	    traversalLeft(node.left,ans);
	    traversalLeaf(node.left,ans); 
	    traversalLeaf(node.right,ans);
	    traversalRight(node.right,ans);
	    
	    return ans;
	}
}
