class Solution {
    public boolean strongPasswordCheckerII(String password) 
    {
        char ch; 
        boolean numberflag=false;
        boolean lowercaseflag=false;
        boolean uppercaseflag=false;
        boolean specialcaseflag=false;
      
        if(password.length()<8)
        {
            return false;
        }
        for(int i=0;i<password.length();i++)
        {
            ch=password.charAt(i);
            if(i>0 && ch==password.charAt(i-1))
            {
                return false;
            }
            if(Character.isDigit(ch))
            {
               numberflag=true; 
            }
            if(Character.isLowerCase(ch))
            {
               lowercaseflag=true; 
            }
            if(Character.isUpperCase(ch))
            {
               uppercaseflag=true; 
            }
           if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='+')
            {
             specialcaseflag=true;   
            }
            
            
        }
           return (numberflag && lowercaseflag && uppercaseflag && specialcaseflag );
        
             
            
       
        
        
    }
}
