import java.util.*;
public class IterativeOrders
{
    public static  void IterativeOrder( DisplayTree.Node node)
    {
        Stack<DisplayTree.Pair> sp=new Stack<>();
        DisplayTree.Pair p=new DisplayTree.Pair(node,1);
        sp.push(p);
        String pre="";
        String In="";
        String post="";
        while(sp.size()>0)
        {
            DisplayTree.Pair t=sp.peek();
            //preorder(print,state++,left)
            if(t.state==1)
            {
              pre+=t.node.data+",";
              t.state++;
              if(t.node.left!=null)
              {
                  DisplayTree.Pair pl=new  DisplayTree.Pair(t.node.left,1);
                  sp.push(pl);
              }

            }
            //inorder(print,state++,right)
            else if(t.state==2)
            {
                In+=t.node.data+",";
                t.state++;
                if(t.node.right!=null)
                {
                    DisplayTree.Pair pl=new  DisplayTree.Pair(t.node.right,1);
                    sp.push(pl);
                }

            }
            //postorder(print,pop)
            else {
                post+=t.node.data+",";
                sp.pop();
            }
            System.out.println(" ");
        }
        System.out.println("Preorder:-"+pre);
        System.out.println("Inorder:-"+In);
        System.out.println("Postorder:-"+post);

    }

    public static void main(String[] args)
    {

        Integer[] arr={50,25,12,null,null,37,null,null,75,62,null,null,18,null,null};
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
        IterativeOrder(root);
    }

}
