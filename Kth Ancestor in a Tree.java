class Tree
{   int ans=0;

    int solve(Node root,int k,int node,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return -1;
        }
        if(root!=null)
        {
            arr.add(root.data);
        }
        if(root.data==node)
        {
            int index=arr.size()-1-k;
            if(index>=0 && index<arr.size()-1)
            {
                ans=arr.get(index);
            }
            else
            {
                ans=-1;
            }
        }
        solve(root.left,k,node,arr);
        solve(root.right,k,node,arr);
        arr.remove(arr.size()-1);
        return ans;
    }
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        ArrayList<Integer> arr=new ArrayList<>();
        //ans=0;
        int res=solve(root,k,node,arr);
        return res;
        
    }
}
