
///Time complexity:-O(n^2)
class Solution {
    public int[] countBits(int n) 
    {
        
        int output[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
      
         String temp=Integer.toBinaryString(i); 
         output[i]= count(temp);
         temp="";
        }
        return output;
        
    }
    
    public int count(String str)
    {
         
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}
