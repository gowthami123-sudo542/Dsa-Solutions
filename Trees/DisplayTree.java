import java.util.*;
public class DisplayTree{
    // Creating the class for the Node
    public  static class Node
    {
        int data;
        Node left;
        Node right;
        // creating the constructor for the Node
        Node(int data,Node left,Node right) {
            this.data = data;
            this.left = left;
            this.right = right;

        }
    }
    // creating the class of node to indicate state
    public static class Pair
    {
        Node node;
        int state;

        Pair(Node n,int s)
        {
            this.node=n;
            this.state=s;
        }
    }
   //Display the tree in preorder format(root,left,right)
    public static void Display(Node node)
    {
        if(node==null)
        {
            return ;
        }
        String str = "";
        str+=node.left==null?".":node.left.data+" ";
        str+="<-"+node.data+"->";
        str+=node.right==null?".":node.right.data+" ";
        System.out.println(str);
        Display(node.left);
        Display(node.right);

    }

    public static void main(String[] args)
    {
        System.out.println("Tree");
     Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
     Node root=new Node(arr[0],null,null);
     Pair pr=new Pair(root,1);
     Stack<Pair> st=new Stack<>();
     st.push(pr);
     int idx=0;
     while(st.size()>0)
     {
         Pair top=st.peek();
         //To traverse over the array

         if(top.state==1)
         {
             idx++;
             if(arr[idx]!=null)
             {
                 top.node.left=new Node(arr[idx],null,null);
                 Pair lp=new Pair(top.node.left,1);
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
                 top.node.right=new Node(arr[idx],null,null);
                 Pair rp=new Pair(top.node.right,1);
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
     //Displaying the Tree
        Display(root);


    }
}
