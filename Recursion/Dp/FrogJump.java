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
public class FrogJump
{

    public static int Method1(int ind,int[] heights) {
        if (ind == 0) {
            return 0;
        }
        int left = Method1(ind - 1, heights) + Math.abs(heights[ind] - heights[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = Method1(ind - 2, heights) + Math.abs(heights[ind] - heights[ind - 2]);
        }
        return Math.min(left, right);
    }
    public static int Method2(int ind,int[] heights,int []dp) {
        if (ind == 0) {
            return 0;
        }
        if(dp[ind]!=0)
        {
            return dp[ind];
        }
        int left = Method2(ind - 1, heights,dp) + Math.abs(heights[ind] - heights[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = Method2(ind - 2, heights,dp) + Math.abs(heights[ind] - heights[ind - 2]);
        }
        return dp[ind]=Math.min(left, right);
    }

    public static void main(String[] args) {
        int n=6;
        int [] arr={30,10,60,10,60,50};
        int [] dp=new int[n+1];
        System.out.println("RECURSION->"+Method1(n-1,arr));
        System.out.println("Memorization->"+Method2(n-1,arr,dp));
        //Method3
        int []tdp=new int[n];
        tdp[0]=0;
        for(int i=1;i<n;i++) {
            int left = tdp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1) {
                right = tdp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            tdp[i] = Math.min(left, right);
        }
        System.out.println("Tabulation->"+tdp[n-1]);
        //Method4
        int prev2=0;
        int prev=0;
        for(int i=1;i<n;i++) {
            int left = prev + Math.abs(arr[i] - arr[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1) {
                right = prev2+ Math.abs(arr[i] - arr[i - 2]);
            }
            int cur = Math.min(left, right);
            prev2=prev;
            prev=cur;
        }
        System.out.println("optimal->"+prev);
    }
}
