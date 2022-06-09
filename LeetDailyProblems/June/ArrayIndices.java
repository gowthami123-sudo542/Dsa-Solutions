## Two pointers
## Time Complexity:-O(n)
class Solution {
    public int[] twoSum(int[] numbers, int target)
    {
        
        int result[]=new int[2];
        int i=0;
        int j=numbers.length-1;
        
        //base case:-
        
        if(numbers==null || numbers.length<2)
        {
            return result;
        }
        while(i<j)
        {
            int sm=numbers[i]+numbers[j];
            if(sm==target)
            {
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            else if(sm>target)
            {
               j--; 
            }
            else
            {
              i++;  
            }
              
        }
        return result;
        
        
    }
}
