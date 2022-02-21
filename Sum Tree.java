class Solution
{
    class Pair{
        boolean isValid;
        int sum;
        
        public Pair(boolean isValid,int sum)
        {
            this.isValid=isValid;
            this.sum=sum;
        }
    }
    public Pair isSumTreeFaster(Node root)
    {
        if(root==null)
        {
            Pair p1=new Pair(true,0);
            return p1;
        }
        if(root.left==null && root.right==null)
        {
            Pair p1=new Pair(true,root.data);
            return p1;
        }
        Pair leftAns=isSumTreeFaster(root.left);
        Pair rightAns=isSumTreeFaster(root.right);
        
        int sum=leftAns.sum+rightAns.sum;
        Pair ans=new Pair(true,0);
        if(leftAns.isValid && rightAns.isValid && root.data==sum)
        {
            ans.isValid=true;
            ans.sum=2*root.data;
        }
        else
        {
            ans.isValid=false;
        }
        return ans;
        
    }
	boolean isSumTree(Node root)
	{
	    return isSumTreeFaster(root).isValid;
             // Your code here
             
	}
}
