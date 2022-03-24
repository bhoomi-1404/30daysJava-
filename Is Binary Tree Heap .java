class Solution {
    int nodeCount(Node tree){
        if(tree==null)
        {
            return 0;
        }
        return 1+nodeCount(tree.left)+nodeCount(tree.right);
    }
    boolean isCBT(Node tree,int i,int count)
    {
        if(tree==null)
        {
            return true;
        }
        if(i>=count)
        {
            return false;
        }
        else
        {
            boolean left=isCBT(tree.left,2*i+1,count);
            boolean right=isCBT(tree.right,2*i+2,count);
            return left&& right;
        }
    }
    boolean isMaxHeap(Node tree)
    {
        if(tree.left==null && tree.right==null)
        {
            return true;
        }
        if(tree.right==null)
        {
            return tree.data>tree.left.data;
        }
        else
        {
            boolean left =isMaxHeap(tree.left);
            boolean right=isMaxHeap(tree.right);
            return (left && right && tree.data>tree.left.data && tree.data>tree.right.data);
        }
    }

    boolean isHeap(Node tree) {
        // code here
        int i=0;
        return (isCBT(tree,i,nodeCount(tree)) && isMaxHeap(tree));
        
    }
}
