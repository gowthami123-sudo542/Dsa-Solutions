class Solution {
    public int kthSmallest(TreeNode root, int k) 
    {
     
      ArrayList<Integer> arr=Inorder(root,new ArrayList<Integer>());
      return arr.get(k-1);
    }
    public ArrayList<Integer> Inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return arr;
        }
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
        return arr;
        
    }
}
