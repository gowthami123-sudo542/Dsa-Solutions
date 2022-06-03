class Solution {
    public boolean isSymmetric(TreeNode root) 
    {
      if(root==null)
      {
          return false;
      }
      return IsSymmetric(root.left,root.right);
    }
    public Boolean IsSymmetric(TreeNode leftNode,TreeNode rightNode)
    {
        if(leftNode==null||rightNode==null)
        {
            return leftNode==rightNode;
        }
        if(leftNode.val!=rightNode.val)
        {
            return false;
        }
        return IsSymmetric(leftNode.left,rightNode.right)&&IsSymmetric(leftNode.right,rightNode.left);
    }
    
}
