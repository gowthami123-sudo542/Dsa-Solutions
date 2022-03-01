// By using the list
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
// By using Array
class CustomStack
{
    int[] stack;
    int size;
    int index;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        size = maxSize;
        index=0;
    }

    public void push(int x) {
       if (index<size){
            stack[index++] = x;
        }
    }

    public int pop() {
        if(index == 0) return -1;
        return stack[--index];
    }

    public void increment(int k, int val) {
        if(stack.length == 0) return;
        for(int i = 0;i<k && i<stack.length;i++)
            stack[i]= stack[i] + val;
    }
            
}
