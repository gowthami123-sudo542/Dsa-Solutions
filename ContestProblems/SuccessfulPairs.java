class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) 
    {
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++)
        {
           int low=0;
           int high=potions.length;
            while(low<high)
            {
                int mid=(low+high)/2;
                
                if(1L*spells[i]*potions[mid]>=success)
                {
                    high=mid;
                }
                else
                {
                    low=mid+1;
                }
                
            }
            spells[i]=potions.length-low;
            
            
        }
        return spells;
    }
}
