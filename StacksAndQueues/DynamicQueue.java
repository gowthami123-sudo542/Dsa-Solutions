public class DynamicQueue extends CircularQueue
{

    private int[] data;
    private static final int  DEFAULT_SIZE=10;
    protected int front=0;
    protected int end=0;
    private int size=0;
    public DynamicQueue()
    {
        super();

    }
    public DynamicQueue(int size)
    {
        super(size);

    }
   @Override
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        int temp[]=new int[data.length*2];

        for(int i=0;i<temp.length;i++)
        {
           temp[i++]=data[(front+i)%data.length] ;
        }
        front=0;
        end=data.length;
        data=temp;

        return true;
    }

    public static void main(String[] args)
    {
          DynamicQueue Dq=new  DynamicQueue(5);

    }





}
