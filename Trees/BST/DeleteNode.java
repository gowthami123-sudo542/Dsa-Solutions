class Solution {
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        // if no nodes in tree
       if(root==null)
       {
           return root;
       }
        // if root.val is same as key
       if(root.val==key)
       {
          return Helper(root); 
       }
        
        TreeNode temp=root;
       // traversal through the tree
        while(root!=null)
        {
            if(root.val>key)
            {
             if(root.left!=null&& root.left.val==key)
             {
               root.left=Helper(root.left);
                 break;
             }
             else
             {
               root=root.left;
             }
            }
             else
             {
                 if(root.right!=null && root.right.val==key)
                 {
                     root.right=Helper(root.right);
                     break;
                 }
                 else
                 {
                     root=root.right;
                 }
             }
         }
       return temp; 
    }
    
     public TreeNode Helper(TreeNode root)
     {
         // if left subtree is not there for node just  return root right
         if(root.left==null)
         {
             return root.right;
         }
         // if right subtree is not there for node just return root left
         else if(root.right==null)
         {
             return root.left;
         }
         TreeNode rightchid=root.right;
         TreeNode lastrightchild=FindlastRightChild(root.left);
         lastrightchild.right=root.right;
         return root.left;
         
     }
    
     public TreeNode FindlastRightChild(TreeNode root)
     {
         if(root.right==null)
         {
             return root;
         }
         return FindlastRightChild(root.right);
     }
}
