## Time complexity:O(n)
public   class Tuple
{
    TreeNode  data;
    int row;
    int col;
    Tuple( TreeNode data,int row,int col)
    {
        this.data=data;
        this.row=row;
        this.col=col;
     }

}
class Solution
{
    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
       //Creating tree map
       // PriorityQueue it is used to sort the integers in same level instead of set function.
       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();


       //Creating the queue to store data
       Queue<Tuple>  q=new ArrayDeque<>();
       //Initialize the data
       q.add( new Tuple(root, 0, 0));
       while(q.size()>0)
       {
           //check for the first element in the queue
           //poll is used to retrieve the data and remove the data from queue
           Tuple tuple=q.poll();
           //get the data from tuple class and store in some variable of type node
           TreeNode value=tuple.data;
           int x=tuple.row;
           int y=tuple.col;
           if(!map.containsKey(x))
           {
               map.put(x,new TreeMap<>());
           }
          if(!map.get(x).containsKey(y))
          {
             map.get(x).put(y, new PriorityQueue<>());
          }
          map.get(x).get(y).add(value.val);
          if(value.left!=null)
          {
              q.add(new Tuple(value.left,x-1,y+1));

          }
          if(value.right!=null)
          {
              q.add(new Tuple(value.right,x+1,y+1));
          }



       }
       //creating the list of list to store each vertical order.
       List<List<Integer>> list=new ArrayList<>();
       for(TreeMap<Integer,PriorityQueue<Integer>> rowvalues:map.values())
       {
           //adding empty list to each row {ex:-2,-1,0,1,,2}
           list.add(new ArrayList<>());
           for(PriorityQueue<Integer> nodes: rowvalues.values())
           {
               while(nodes.size()>0)
               {
                   //System.out.println(nodes.peek());
                   list.get(list.size()-1).add(nodes.poll());
               }
           }
       }
       return list;
        
    }
}
