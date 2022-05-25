// Finding the size of the tree(size=no of nodes in tree)
    public static int Size(Node node)
    {
        if(node ==null)
        {
            return 0;
        }
        int LeftPart=Size(node.left);
        int RightPart=Size(node.right);
        int total=LeftPart+RightPart+1;
        return total;
    }
    //  Finding the sum of the tree
    public static int Sum(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftsum=Sum(node.left);
        int rightsum=Sum(node.right);
        int totalsum=leftsum+rightsum+node.data;
        return totalsum;
    }
    //Finding the max of the tree
    public static int MaxNode(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftmax=MaxNode(node.left);
        int rightmax=MaxNode(node.right);
        int maxnode=Math.max(node.data,Math.max(leftmax,rightmax));
        return maxnode;
    }
    //Finding the min of the tree
    public static int MinNode(Node node)
    {
        if(node==null)
        {
            return Integer.MAX_VALUE;
        }
        int leftmin=MinNode(node.left);
        int rightmin=MinNode(node.right);
        int minnode=Math.min(node.data,Math.min(leftmin,rightmin));
        return minnode;
    }
    //Finding the height of the tree
    //(-1 for edges and 0 for nodes)
    public static int HeightNode(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        int LeftHeight=HeightNode(node.left);
        int RightHeight=HeightNode(node.right);
        int TotalHeight=Math.max(LeftHeight,RightHeight)+1;
        return TotalHeight;

    }
