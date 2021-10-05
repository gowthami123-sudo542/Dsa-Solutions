##  Tm:-O(1)

package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dell
 */

/*

eg:- let n=6 110
       n-1=5 101
andoperation 100!=0

         n=8 1000
       n-1=7 0111
andoperation 0000==0

*/
public class PowerofTwo 
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans=PowerofTwo(n);
        
        if(ans==0)
        {
           System.out.println("The number is power of two"); 
        }
        else
        {
           System.out.println("The number is  not power of two"); 
        }


       
      }
       public static int PowerofTwo(int n)
       {
           
           
         int result=n&(n-1);
         return result;
           
       }
    
}
