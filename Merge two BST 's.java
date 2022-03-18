class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    static  ArrayList<Integer> merge;
    public ArrayList<Integer> inorder(Node root,ArrayList<Integer> a)
    {
        if(root==null)
        {
            return a;
        }
        inorder(root.left,a);
        a.add(root.data);
        inorder(root.right,a);
        return a;
    }
    public static ArrayList<Integer> mergeArray(ArrayList<Integer> ans1,ArrayList<Integer> ans2,ArrayList<Integer> merge)
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
        while(i< ans1.size() && j<ans2.size())
        {
            if(ans1.get(i)<ans2.get(i))
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
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        ArrayList <Integer> a1=new ArrayList<>();
          ArrayList <Integer> a2=new ArrayList<>();
        ArrayList<Integer> ans1=inorder(root1,a1);
        ArrayList<Integer> ans2=inorder(root2,a2);
        
       merge=new ArrayList<>();
        ArrayList<Integer> merge1=mergeArray(ans1,ans2,merge);
        Collections.sort(merge1);
        return merge1;
    }
}
