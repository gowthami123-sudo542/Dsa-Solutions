## DisplayTree Function is in Displaytree File
import java.util.*;
public class Paths
{
    static ArrayList<Integer> path=new ArrayList<>();
    public static Boolean NodeToRootPath(DisplayTree.Node node,ArrayList<Integer> a,int data)
    {

        if(node==null) {
            return false;
        }
        a.add(node.data);
        if(node.data==data)
        {
            return true;
        }

        if(NodeToRootPath(node.left,a,data)||NodeToRootPath(node.right,a,data))
        {
            return true;
        }
        a.remove(a.size()-1);
        return false;

    }
    public static ArrayList<Integer> Path(DisplayTree.Node node, ArrayList<Integer> integers, int data)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        if(arr==null)
        {
            return arr;
        }
        NodeToRootPath(node,arr,data);
        return arr;
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
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("The Path from Node to Root is->"+Path(root,al,30));


    }
}
