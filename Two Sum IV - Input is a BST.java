class Solution {
    public ArrayList<Integer> solve(TreeNode root,ArrayList<Integer> arr)
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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList <Integer> arr=new ArrayList<>();
      ArrayList<Integer> ans=solve(root,arr);
        int i=0;
        int j=ans.size()-1;
        while(i<j)
        {
            if(ans.get(i)+ans.get(j)==k)
            {
                return true;
            }
             if(ans.get(i)+ans.get(j)>k)
            {
                j--;
            }
            if(ans.get(i)+ans.get(j)<k)
            {
                i++;
            }
        }
        return false;
    }
}
