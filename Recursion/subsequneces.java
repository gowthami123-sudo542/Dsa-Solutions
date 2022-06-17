## Subsequnce:-contiguous or not non contiguous elements which follows order

import java.util.ArrayList;

public class Subsequences
{

    public static void Subsequences(int ind, ArrayList<Integer> arr,int a[],int n)
    {
        if(ind>=n)
        {
            System.out.println(arr);
            return;
        }

        Subsequences(ind+1,arr,a,n);
        arr.add(a[ind]);

        Subsequences(ind+1,arr,a,n);
        arr.remove(arr.size()-1);

    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        Subsequences(0,new ArrayList<>(),arr,3);
    }
}
