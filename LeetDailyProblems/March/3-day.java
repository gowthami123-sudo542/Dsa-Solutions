## Arithmetic Slices
## Time Complexity:- O(n)
class Solution{
    public int numberOfArithmeticSlices(int[] nums) 
    {
        
     
      int n=nums.length;
      int result_count=0;
      int temp=0;
      if(n<3)
      {
          return 0;
      }
      
     for(int i=2;i<n;i++)
     {
         if((nums[i]-nums[i-1])==(nums[i-1]-nums[i-2]))
         {
            temp=temp+1;
            result_count=result_count+temp;
         }
         else
         {
             temp=0;
         }
     }
       
      return result_count;   
          
      }
     
          
      
        
        
    
}
