class Solution {
    public static ArrayList<Integer> solve(TreeNode root,ArrayList<Integer>arr)
    {
        if(root==null)
        {
            return arr;
        }
        solve(root.left,arr);
        arr.add(root.val);
        solve(root.right,arr);
        return arr;
    }
    public TreeNode inorderBst(int s,int e,ArrayList<Integer> ans)
    {
        if(s>e)
        {
            return null;
        }
        int mid=(s+e)/2;
        TreeNode temp=new TreeNode(ans.get(mid));
        temp.left=inorderBst(s,mid-1,ans);
        temp.right=inorderBst(mid+1,e,ans);
        return temp;
        
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList <Integer> arr=new ArrayList<>();
        ArrayList<Integer> ans=solve(root,arr);
       return inorderBst(0,ans.size()-1,ans);
    }
}
