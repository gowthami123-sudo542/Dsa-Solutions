class Solution {
    static int findPosition(int N)
    {
       
       int count=0;
       if(N==0)
       {
           return -1;
       }
       int ans=N&(N-1);
       // TO have only one set bit it should be always of power 2.
       //excedding time;
      /* if(ans==0)
       {
          
          
           while(N>0)
           {
               if((N&1)!=1)
               {
                 count++;
                 
               }
               N>>=1;
               
               
           }
           
           
       }*/
       
       
       
       /*
       
       
       
        n=2  (10)
        count=0;
        while(n>0  && n&1 ==0)

          10&1=0
          count=count+1=1;
          leftshit of n
           n=1
           condition fails and 
           n=1 
           return 1+1=2;
           position of set bit is 2;
       
       
       
       
       */
       while((N>0) &&(N&1)==0)
       {
           N=N>>1;
           count++;
           
       }
       
       
       
     
       return (N==1)?count+1:-1;
       
        
        
     
    }
}
