
class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        
     int slen=s.length();
     int tlen=t.length();
     
     int i=0;
     int j=0;
     
     
       
      
       while(i<slen&&j<tlen)
       {
         if(s.charAt(i)==t.charAt(j))
          {
              i++;
              j++;
          } 
           else
           {
             j++;  
           }
       }
          
          
       
     
    if(i==slen)
    {
        return true;
    }
     return false;   
        
    }
}
