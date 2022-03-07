
class Solution
{
    //Function to return the maximum sum of non-adjacent nodes.
    public static  class Pair{
        int first;
        int second;
        public Pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    static Pair solve(Node root)
    {
        if(root==null)
        {
            Pair p= new Pair(0,0);
            return p;
        }
        Pair leftAns=solve(root.left);
        Pair rightAns=solve(root.right);
        Pair res=new Pair(0,0);
        res.first=leftAns.second+rightAns.second+root.data;
        res.second=Math.max(leftAns.first,leftAns.second)+Math.max(rightAns.first,rightAns.second);
        return res;
    }
    static int getMaxSum(Node root)
    {
        // add your code here
        Pair res=solve(root);
        return Math.max(res.first,res.second);
    }
}
