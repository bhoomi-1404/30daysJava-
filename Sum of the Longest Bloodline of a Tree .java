class Solution{
    public static int maxLen;
    public static int  maxSum;
    void  solve(Node root,int sum,int len)
    {
        if(root==null)
        {
            if(len>maxLen)
            {
                maxLen=len;
                maxSum=sum;
            }
            else if(len==maxLen)
            {
                maxSum=Math.max(sum,maxSum);
            }
            return ;
        }
       // sum=sum+;
        solve(root.left,sum+root.data,len+1);
        solve(root.right,sum+root.data,len+1);
       //return maxSum; 
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int sum=0;
         maxSum=0;
        int len=0;
         maxLen=0;
        solve(root,sum,len);
        return maxSum;
    }
}
