import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;
public class Traversals
{

    //DisplayTree dt=new DisplayTree();
   public static void Inorder(DisplayTree.Node node)
   {

       if(node==null)
       {
           return;
       }
       Inorder(node.left);
      System.out.print(node.data+",");

      Inorder(node.right);
   }
    public static void preorder(DisplayTree.Node node)
    {

        if(node==null)
        {
            return;
        }
        System.out.print(node.data+",");

        preorder(node.left);

        preorder(node.right);
    }
    public static void postorder(DisplayTree.Node node)
    {

        if(node==null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+",");

    }
    public static void LevelOrder(DisplayTree.Node node)
    {
        Queue<DisplayTree.Node>  q=new ArrayDeque<>();
        q.add(node);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                node=q.remove();
                System.out.print(node.data+" ");
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {

        Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        DisplayTree.Node root=new DisplayTree.Node(arr[0],null,null);
        DisplayTree.Pair pr=new DisplayTree.Pair(root,1);
        Stack<DisplayTree.Pair> st=new Stack<>();
        st.push(pr);
        int idx=0;
        while(st.size()>0)
        {
            DisplayTree.Pair top=st.peek();
            //To traverse over the array

            if(top.state==1)
            {
                idx++;
                if(arr[idx]!=null)
                {
                    top.node.left=new DisplayTree.Node(arr[idx],null,null);
                    DisplayTree.Pair lp=new DisplayTree.Pair(top.node.left,1);
                    st.push(lp);
                }
                else {
                    top.node.left=null;
                }
                top.state++;
            }
            else if(top.state==2)
            {
                idx++;
                if(arr[idx]!=null)
                {
                    top.node.right=new DisplayTree.Node(arr[idx],null,null);
                    DisplayTree.Pair rp=new DisplayTree.Pair(top.node.right,1);
                    st.push(rp);
                }
                else {
                    top.node.right=null;
                }
                top.state++;
            }
            else {
                st.pop();
            }
        }
        DisplayTree.Display(root);
        System.out.println("Inorder");
        Inorder(root);
        System.out.println(" ");
        System.out.println("Preorder");

        preorder(root);
        System.out.println(" ");
        System.out.println("Postorder");

        postorder(root);
        // level order
        System.out.println(" ");
        System.out.println("level order");

        LevelOrder(root);


    }
}
