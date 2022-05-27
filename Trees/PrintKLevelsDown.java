//It follows Preorder
public static void PrintKLevelsDown(DisplayTree.Node node,int k)
    {
        if(node==null || k<0)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(node.data+" ");
        }
        PrintKLevelsDown(node.left,k-1);
        PrintKLevelsDown(node.right,k-1);
    }
