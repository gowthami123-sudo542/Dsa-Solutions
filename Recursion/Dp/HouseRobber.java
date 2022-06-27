public class HouseRobber
{


    public static int HouseRobberOptimization(int ind,int []arr)
    {

        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++)
        {
            int take=arr[i];
            if(i>1)
            {
                take=take+prev2;
            }
            int nottake=0+prev;

            int curr=Math.max(take,nottake);
            prev2=prev;
            prev=curr;

        }
        return prev;


    }
    public static void main(String[] args)
    {
        int n = 4;
        int[] arr = {2,1,3,9};
        int [] t1=new int[n-1];
        int [] t2=new int[n-1];
        int j=0;
         int k=0;
        for(int i=0;i<n;i++)
        {
            if(i!=0)
            {
                t1[j++]=arr[i];
            }
            if(i!=n-1)
            {
                t2[k++]=arr[i];
            }
        }
        System.out.println("Optimization:-"+Math.max(HouseRobberOptimization(n-2,t1),HouseRobberOptimization(n-2,t2)));

    }
}
