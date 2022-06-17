class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
      List<Integer>list=new ArrayList<>();
      List<List<Integer>> finallist=new ArrayList<>();  
      combinationSum(candidates,target,list,finallist,0);  
        return finallist;
        
    }
    public void combinationSum(int[] candidates, int target,List<Integer>list,List<List<Integer>> finallist,int ind) 
    {
      if(ind>=candidates.length)
      {
          if(target==0)
          {
              finallist.add(new ArrayList<>(list));
             
              
          }
           return;
      }
        if(candidates[ind]<=target)
        {
            list.add(candidates[ind]);
            combinationSum(candidates,target-candidates[ind],list,finallist,ind);
             list.remove(list.size()-1);
        }
          combinationSum(candidates,target,list,finallist,ind+1);
    }
}
