
class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    
  static int MAX = Integer.MAX_VALUE;
  static int MIN = Integer.MIN_VALUE;
 
  static class nodeInfo {
    int size; // Size of subtree
    int max; // Min value in subtree
    int min; // Max value in subtree
    boolean isBST; // If subtree is BST
 
    nodeInfo() {
    }
 
    nodeInfo(int size, int max, int min, boolean isBST) {
      this.size = size;
      this.max = max;
      this.min = min;
      this.isBST = isBST;
    }
  }
 
  static nodeInfo largestBST(Node root) {
 
    // Base cases : When tree is empty or it has one child.
    if (root == null) {
      return new nodeInfo(0, MIN, MAX, true);
    }
    if (root.left == null && root.right == null) {
      return new nodeInfo(1, root.data, root.data, true);
    }
 
    // Recur for left subtree and right subtrees
    nodeInfo left = largestBST(root.left);
    nodeInfo right = largestBST(root.right);
 
    // Create a return variable and initialize its size.
    nodeInfo returnInfo = new nodeInfo();
 
    // If whole tree rooted under current root is BST.
    if (left.isBST && right.isBST && left.max < root.data && right.min > root.data) {
      returnInfo.min = Math.min(Math.min(left.min, right.min), root.data);
      returnInfo.max = Math.max(Math.max(left.max, right.max), root.data);
 
      // Update answer for tree rooted under current 'root'
      returnInfo.size = left.size + 1 + right.size;
      returnInfo.isBST = true;
      return returnInfo;
    }
 
    // If whole tree is not BST, return maximum of left and right subtrees
    returnInfo.size = Math.max(left.size, right.size);
    returnInfo.isBST = false;
    return returnInfo;
  }
    static int largestBst(Node root)
    {
        // Write your code here
        return largestBST(root).size;
        
    }
    
}
