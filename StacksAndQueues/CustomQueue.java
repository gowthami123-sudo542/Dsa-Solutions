import java.util.concurrent.ExecutionException;

public class CustomQueue
{
    private int[] data;
    private static final int  DEFAULT_SIZE=10;
    int end=0;
   //constructors

    public CustomQueue()
    {
       this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data=new int[size];
    }
   //isEmpty and isFUll functions
    public boolean isFull()
    {

        return end==data.length;
    }
    public boolean isEmpty()
    {
        return end==0;
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
        //int len=data.length();
        int removed=data[0];
        for(int i=1;i<end;i++)
        {
            data[i-1]=data[i];

        }
        end--;
        return removed;

    }
    public int front() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+"->");
        }
        System.out.println("end");
    }
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(90);
        queue.insert(30);
        queue.insert(20);
        queue.insert(67);
        queue.insert(12);
        queue.display();
        queue.remove();
        queue.display();


    }



}

