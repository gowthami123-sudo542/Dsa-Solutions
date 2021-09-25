public class evenandodd 
{
    
    public static void main(String [] args)
    {
          
        
        int[] arr={2,3,4,5,4,5,2};
        System.out.println(unique(arr)); 
       
    }
        public static int unique(int arr[])
        {
            
            int uq=0;
            for(int n:arr)
            {
                uq ^=n;
            }
            return uq;
         }
        
    
}
