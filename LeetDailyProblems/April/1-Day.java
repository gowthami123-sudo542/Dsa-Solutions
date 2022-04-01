## Two pointer method
## No extra Space
## Time Complexity:-O(n/2)
class Solution {
    public void reverseString(char[] s) 
    {
        int m=0;
        int n=s.length-1;
        while(m<=n)
        {
           char temp=s[m];
            s[m]=s[n];
            s[n]=temp;
            m++;
            n--;
        }
        
    }
}
