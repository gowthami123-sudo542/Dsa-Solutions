 public static ArrayList<Integer> BottomView(DisplayTree.Node node, ArrayList<Integer> b)
    {
        b=new ArrayList<>();
        if(node==null)
        {
            return b;
        }
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(node,0));
        while(!q.isEmpty()) {
            Pair p = q.remove();
            DisplayTree.Node temp = p.node;
            int topp = p.position;

            map.put(topp, temp.data);


            if (temp.left != null) {
                q.add(new Pair(temp.left, topp - 1));
            }
            if (temp.right != null) {
                q.add(new Pair(temp.right, topp + 1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            b.add(entry.getValue());
        }
        //System.out.println(al);
        return b;

    }
