mport java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SubSet
{
    public static void main(String[] args)
    {
       ArrayList<Integer> arr=new ArrayList<>();
       arr.add(3);
       arr.add(1);
       arr.add(2);
        ArrayList<Integer> list=new ArrayList<>();
        SubSet(arr,0,0,3,list);
        Collections.sort(list);
        System.out.println(list);


    }
    public static void SubSet(ArrayList<Integer>arr,int ind,int sum,int n,ArrayList<Integer>sumset)
    {

        if(ind==n)
        {
            sumset.add(sum);
            return;
        }
        SubSet(arr,ind+1,sum+ arr.get(ind),n,sumset);
        SubSet(arr,ind+1,sum,n,sumset);


    }
}
