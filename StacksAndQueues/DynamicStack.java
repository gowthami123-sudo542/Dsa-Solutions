import org.codehaus.groovy.vmplugin.v8.IndyArrayAccess;

public class DynamicStack extends CustomStack
{

    public DynamicStack()
    {
        super();
    }
    public DynamicStack(int size)
    {
        super(size);
    }
     @Override
     public boolean push(int item)
     {
        if(this.isFull())
        {
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;

        }
        return super.push(item);

     }
    public static void main(String[] args) throws StackException
    {
        DynamicStack ds=new DynamicStack(5);
        ds.push(34);
        ds.push(35);
        ds.push(45);
        ds.push(32);
        ds.push(21);
        ds.push(22);
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());


    }
}
