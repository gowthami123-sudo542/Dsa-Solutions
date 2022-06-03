 public static class Pair
   {
       DisplayTree.Node node;
       int position;
       Pair(DisplayTree.Node node,int x)
       {
           node=node;
           position=x;
       }
   }
    public static ArrayList<Integer> TopView(DisplayTree.Node node,ArrayList<Integer> al)
    {
     al=new ArrayList<>();
     if(node==null)
     {

         return al;
     }
     Queue<Pair> q=new ArrayDeque<>();
     Map<Integer,Integer> map=new TreeMap<>();
     q.add(new Pair(node,0));
     while(!q.isEmpty())
     {
         Pair p=q.remove();
         DisplayTree.Node temp=p.node;
         int topp=p.position;
         if(map.get(topp)==null)
         {
          map.put(topp,temp.data);
         }

         if(temp.left!=null)
         {
             q.add(new Pair(temp.left,topp-1));
         }
         if(temp.right!=null)
         {
             q.add(new Pair(temp.right,topp+1));
         }

     }
     for(Map.Entry<Integer,Integer> entry:map.entrySet())
     {
         al.add(entry.getValue());
     }
       //System.out.println(al);
        return al;
    }
    public static ArrayList<Integer> TopViewArray(DisplayTree.Node node)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        if(arr==null)
        {
            return arr;
        }
        TopView(node,arr);
        return arr;
    }
