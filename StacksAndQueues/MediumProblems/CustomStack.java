class CustomStack {
    private List<Integer> list=new ArrayList<>();
    private int size;
    public CustomStack(int maxSize) {
    size=maxSize;
    }
    
    public void push(int x) {
      if(list.size()<size)
      {
          list.add(x);
      }
    }
    
    public int pop() 
    {
       return list.isEmpty()?-1:list.remove(list.size()-1); 
    }
    
    public void increment(int k, int val) 
    {
        for(int i=0;i<k&&i<list.size();i++)
        {
            list.set(i,list.get(i)+val);
        }
    }
}

