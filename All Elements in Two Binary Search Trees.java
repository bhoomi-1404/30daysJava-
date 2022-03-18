 */
class Solution {
    public ArrayList<Integer> solve(TreeNode root, ArrayList<Integer> a)
    {
        if(root==null)
        {
            return a;
        }
        solve(root.left,a);
        a.add(root.val);
        solve(root.right,a);
        return a;
    }
    public ArrayList<Integer> merger(ArrayList<Integer> ans1,ArrayList<Integer> ans2,ArrayList<Integer> merge)
    {
        if(ans1.size()==0)
        {
            return ans2;
        }
        if(ans2.size()==0)
        {
            return ans1;
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<ans1.size() && j<ans2.size())
        {
            if(ans1.get(i)<ans2.get(j))
            {
                merge.add(ans1.get(i));
                i++;
            }
            else
            {
                merge.add(ans2.get(j));
                j++;
            }
            k++;
        }
        while(i<ans1.size())
        {
            merge.add(ans1.get(i));
            i++;
            k++;
        }
        while(j<ans2.size())
        {
            merge.add(ans2.get(j));
            j++;
            k++;
        }
        return merge;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> bst1=new ArrayList<>();
          ArrayList<Integer> bst2=new ArrayList<>();
        ArrayList<Integer> ans1=solve(root1,bst1);
        ArrayList<Integer> ans2=solve(root2,bst2);
        ArrayList<Integer> merge=new ArrayList<>();
        return merger(ans1,ans2,merge);
        
    }
}
