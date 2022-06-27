/** Method1(RECURSION)**/
// Time Complexity:-O(n)
//Space Complexity:-O(n)

/** Method2(Memorization)**/
//Time Complexity:-O(n)
//Space Complexity:-O(n)+O(n)
/** Method3(Tabulation)**/
//Time Complexity:-O(n)
//Space Complexity:-O(n)
/** Method4(Optimal)**/
//Time Complexity:O(n)
//Space Complexity:-O(1)
import java.util.*;

public class MaximumSumofNonAdjacent
{

    public static int MAximumSumRecursion(int ind,int []arr)
    {
        if(ind==0)
        {
            return arr[ind];

        }
        if(ind<0)
        {
            return 0;
        }
       int pick=arr[ind]+MAximumSumRecursion(ind-2,arr);
        int notpick=0+MAximumSumRecursion(ind-1,arr);
        return Math.max(pick,notpick);
    }
    public static int MAximumSumMemorization(int ind,int []arr,int [] dp)
    {
        if(ind==0)
        {
            return arr[ind];

        }
        if(ind<0)
        {
            return 0;
        }
        if(dp[ind]!=0)
        {
            return dp[ind];
        }
        int pick=arr[ind]+MAximumSumMemorization(ind-2,arr,dp);
        int notpick=0+MAximumSumMemorization(ind-1,arr,dp);
        return dp[ind]=Math.max(pick,notpick);
    }
    public static int MAximumSumTabulation(int ind,int []arr,int [] dp,int n)
    {

      for(int i=1;i<arr.length;i++)
      {
        int take=arr[ind]+dp[i-2];
        int nottake=0+dp[i-1];
        dp[i]=Math.max(take,nottake);
      }
     return dp[n-1];



    }
    public static int MAximumSumOptimization(int ind,int []arr)
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



    public static void main(String[] args) {
        int n = 4;
        int[] arr = {2,1,3,9};
        int []dp=new int[n+1];
        System.out.println("Recursion:-"+MAximumSumRecursion(n-1,arr));

        System.out.println("Memorization:-"+MAximumSumMemorization(n-1,arr,dp));
        System.out.println("Optimization:-"+MAximumSumOptimization(n-1,arr));
    }
}
