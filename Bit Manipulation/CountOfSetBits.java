class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    
    
    
    
    
    
    /*
    
    
    finding largestpowerof2

                    2^0=1(001)
                    2^1=2(010)

                    2^2=4(100)''''''''''''''''
                x=0;     
                let n=5
                while((1<<x)<=n)
                {
                  x++; x=1
                       x=2
                       x=3
                }
                return x=x-1*/
    public static int countSetBits(int n)
    {
        
        
       /* int totalcount=0;
        int count=0;
        
    
        for(int i=1;i<=n;i++)
        {
           
           
           while(i>0)
           {
           if((i&1)==1)
           {
               
               count++;
           }
           i=i>>1;
           }
           
           
           totalcount=totalcount+count;
            
        }
        return totalcount;*/
        
        if(n==0)
        {
            return 0;
        }
        int col=largestpowerof2(n);
        
        int bitsbefore2x= col*(1<<(col-1));
        int mstafter2x=n-(1<<col)+1;
        int rem=n-(1<<col);
        
        int res=bitsbefore2x+mstafter2x+countSetBits(rem);
        return res;
        
        
        
    }
    
    public static int largestpowerof2(int n)
    {
        
        int x=0;
        
        while((1<<x)<=n)
        {
            x++;
        }
        return x-1;
    }
}
