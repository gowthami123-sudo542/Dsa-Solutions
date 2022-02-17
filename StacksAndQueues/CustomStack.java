//If we implement exception to any method in class
//then we should use  it to main
public class CustomStack
{


    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    //Constructor
    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
      this.data=new int[size];
    }
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty())
        {
           throw new StackException("Cannot pop from an empty stack!");

        }
        return data[ptr--];
    }
   public int peek()
   {
       if(isEmpty())
       {
           System.out.println("Stack is Empty!");

       }
       return data[ptr];
   }
    public boolean isFull()
    {
        return ptr==data.length-1;
    }
    public boolean isEmpty()
    {
        return ptr==-1;
    }
    public static void main(String[] args) throws StackException
    {

        CustomStack  stack=new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(50);
        stack.push(64);
        stack.push(75);
        stack.push(90);
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
    }
}
