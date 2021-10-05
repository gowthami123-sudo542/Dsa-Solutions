## loop will for the bitsize;


/*  eg: 6 -1*125 +1*25 +0*5==150
  
  
  steps: 
      -> Follows this steps in while loop.
       1)First find the last digit of the number and then do the right shift.
       2)Multiply the lastdigit with five powers.
  

*/

import java.util.Scanner;

public class magicNumber 
{
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
       
        System.out.println("The magic number is:-"+magicNumber(n));
        
     }
     public static int  magicNumber(int n)
     {
       int sum=0;  
       int base=5;
       while(n>0)
       {
          int lastdigit=n&1;
          n=n>>1;
          sum=sum+base*lastdigit;
          base=base*5;
       }
      return sum;
       
      
     }
    
}
