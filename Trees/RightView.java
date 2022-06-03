 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
         RightView(root,list,0);
         return list;
    }
    
    public void RightView(TreeNode curr,List<Integer> l,int level)
    {
        if(curr==null)
        {
            return;
        }
        if(level==l.size())
        {
            l.add(curr.val);
        }
        RightView(curr.right,l,level+1);
        RightView(curr.left,l,level+1);
    }
}
