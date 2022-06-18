class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        
      List<Integer>list=new ArrayList<>();
      List<List<Integer>> finallist=new ArrayList<>(); 
      Arrays.sort(candidates);
      combinationSum2(candidates,target,list,finallist,0);  
      return finallist;
    }
    public void combinationSum2(int[] candidates,int target,List<Integer>list,List<List<Integer>> finallist,int indx)
    {
        
        if(target==0)
        {
            finallist.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=indx;i<candidates.length;i++)    
        {
           if(i>indx&& candidates[i]==candidates[i-1])
           {
               continue;
           }
           if(candidates[i]>target)
               
           {
               break;
           }
            list.add(candidates[i]);
            combinationSum2(candidates,target-candidates[i],list,finallist,i+1); 
            list.remove(list.size()-1);
            
        }
        
        
    }
}
