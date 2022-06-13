## Time Complexity:-O(n)
## Space Complexity:-O(1)

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        
      return BstFromPreorder(preorder,Integer.MAX_VALUE,new int[]{0});
    
        
    }
    public TreeNode BstFromPreorder(int[] A,int bound,int i[])
    {
        if(i[0]==A.length || A[i[0]]>bound)
        {
            return null;
        }
        TreeNode root=new TreeNode(A[i[0]++]);
        root.left=BstFromPreorder(A,root.val,i);
        root.right=BstFromPreorder(A,bound,i);
        return root;
    }
}
