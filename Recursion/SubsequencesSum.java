import java.util.ArrayList;

public class SubsequencesSum
{

    public static void SubsequenceSum(int ind, ArrayList<Integer> arr, int a[], int n,int sum,int s)
    {
        if(ind>=n)
        {
            if(s==sum)
            {
                System.out.println(arr);
            }

            return;
        }


        arr.add(a[ind]);
        s=s+a[ind];
        SubsequenceSum(ind+1,arr,a,n,sum,s);
        s=s-a[ind];
        arr.remove(arr.size()-1);
        SubsequenceSum(ind+1,arr,a,n,sum,s);


    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        SubsequenceSum(0,new ArrayList<>(),arr,3,3,0);
    }
}
