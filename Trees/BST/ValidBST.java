class Solution {
    public boolean isValidBST(TreeNode root) 
    {
        return ValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean ValidBST(TreeNode root,long minval,long maxval)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val>=maxval || root.val<=minval)
        {
            return false;
        }
        return ValidBST(root.left,minval,root.val)&&ValidBST(root.right,root.val,maxval);
    }
}
