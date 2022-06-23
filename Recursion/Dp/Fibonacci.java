/** Method1 ***/
// Memorization
//Time Complexity:-O(n)
// Space Complexity:-O(n)+O(n)
/** Method2 **/
//Tabulation
//Time Complexity:-O(n)
// Space Complexity:-O(n)
/** Method3 **/
// variable
//Time Complexity:-O(n)
// Space Complexity:-O(1)

public class Fibonacci
{
    //Method1
    public static int  function(int n,int[] dp)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return n;
        }
        return dp[n]=function(n-1,dp)+function(n-2,dp);
    }
    public static void main(String[] args) {
        int n=5;
        int [] arr=new int[n+1];
        // Method1
        //System.out.println(function(n,arr));

        // Method2
        int tdp[]=new int[n+1];
        tdp[0]=0;
        tdp[1]=1;
        for(int i=2;i<tdp.length;i++)
        {
            tdp[i]=tdp[i-1]+tdp[i-2];
        }

        System.out.println(tdp[n]);
        //Method3
        int prev2=0;
        int prev=1;
        int cur=0;
        for(int i=2;i<=n;i++)
        {
            cur=prev+prev2;
            prev2=prev;
            prev=cur;
        }
        System.out.println(prev);
    }
}
