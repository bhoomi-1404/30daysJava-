import sun.reflect.generics.tree.Tree;

import java.util.Queue;
import java.util.Scanner;
import  java.util.*;
public class VerticalOrderTreversal {
    public static class TreeNode<T>{
        TreeNode left;
        TreeNode right;
        T data;
        public TreeNode (T data)
        {
            this.data=data ;
        }
    }
    public static class Pair{
        TreeNode<Integer> node=null;
        int hl=0;
        public Pair(int hl,TreeNode<Integer> node)
        {
            this.node=node;
            this.hl=hl;
        }

    }
    public static List<List<Integer>> vertical (TreeNode<Integer> root)
    {
         Queue <Pair> q=new LinkedList<>();
         HashMap<Integer, List<Integer>> hm=new HashMap<>();
         int max=0;
         int min=0;
         List<List<Integer>> ans=new ArrayList<>();
         if(root==null)
         {
             return ans;
         }

             q.add( new Pair(0,root));

         while(!q.isEmpty())
         {
             int size=q.size();
             while(size!=0)
             {
                 Pair front=q.poll();
                 max=Math.max(max, front.hl);
                 min=Math.min(min,front.hl);
//                 if(!hm.containsKey(front.hl))
//                 {
//                     hm.put( front.hl,new ArrayList<>());
//                     hm.get(front.hl).add( front.node.data);
//                 }
//                 else
//                 {
//                     hm.get(front.hl);
//                 }
                 ArrayList<Integer> get= (ArrayList<Integer>) hm.get(front.hl);
                 if(get==null)
                 {
                     hm.put(front.hl, new ArrayList<Integer>());
                     hm.get(front.hl).add(front.node.data);
                 }
                 else
                 {
                     get.add(front.node.data);
                     hm.put(front.hl,get);
                 }
                 if(front.node.left!=null)
                 {
                     q.add(new Pair(front.hl-1,front.node.left));
                 }
                 if(front.node.right!=null)
                 {
                     q.add(new Pair(front.hl+1,front.node.right));
                 }
                 size--;
             }

         }
        for(int i=min;i<=max;i++)
        {
            ans.add(hm.get(i));
        }
         return ans;
    }
    public static TreeNode<Integer> takeInput()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter root");
        int rootData=s.nextInt();
        TreeNode<Integer> root=new TreeNode<>(rootData);
        if(root.data==-1)
        {
            return null;
        }
        Queue<TreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode front=q.poll();
            System.out.println("Enter left child of "+front.data);
            int left=s.nextInt();
            if(left!=-1)
            {
                TreeNode<Integer> leftChild=new TreeNode<>(left);
                front.left=leftChild;
                q.add(leftChild);
            }
            System.out.println("Enter right child of "+front.data);
            int right=s.nextInt();
            if(right!=-1)
            {
                TreeNode<Integer> rightChild=new TreeNode<>(right);
                front.right=rightChild;
                q.add(rightChild);
            }
        }
        return root;
    }

    public static void main(String args[])
    {
TreeNode<Integer> root=takeInput();
    System.out.println(vertical(root));
    }
}
