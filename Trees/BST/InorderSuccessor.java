# time complexity-O(n)
 # space complexity:O(1)
   
   
 class Sloution
 {
   
   public TreeNode InorderSuccessor(TreeNode root,TreeNode val)
   {
     
     TreeNode successor=null;
     while(root!=null)
     {
       if(val.val>=root.val)
       {
         root=root.right;
       }
       else
       {
         succesor=root;
         root=root.left;
       }
     }
     
   }
   
 }

## Predecessor
    TreeNode predecessor=null;
    while(root!=null)
    {
      
      if(val.val>=root.val)
      {
        predecessor=root;
        root=root.left;
      }
      else
      {
        root=root.left;
      }
    }
