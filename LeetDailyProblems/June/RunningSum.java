## Time Complexity:-O(n)
  class Solution {
    public int[] runningSum(int[] nums) 
    {
        int arr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+nums[i];
            arr[i]=sum;
            
        }
        return arr;
        
    }
}
#***************************#
#Without using Extra Array
class Solution {
    public int[] runningSum(int[] nums) 
    {
    
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        return nums;
        
    }
}
